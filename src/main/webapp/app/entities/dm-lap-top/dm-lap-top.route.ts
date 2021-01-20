import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, Routes, Router } from '@angular/router';
import { Observable, of, EMPTY } from 'rxjs';
import { flatMap } from 'rxjs/operators';

import { Authority } from 'app/shared/constants/authority.constants';
import { UserRouteAccessService } from 'app/core/auth/user-route-access-service';
import { IDmDienThoai, DmDienThoai } from 'app/shared/model/dm-dien-thoai.model';
import { DmLapTopService } from './dm-lap-top.service';
import { DmLapTopComponent } from './dm-lap-top.component';

@Injectable({ providedIn: 'root' })
export class DmLapTopRoute implements Resolve<IDmDienThoai> {
  constructor(private service: DmLapTopService, private router: Router) {}

  resolve(route: ActivatedRouteSnapshot): Observable<IDmDienThoai> | Observable<never> {
    const id = route.params['id'];
    if (id) {
      return this.service.find(id).pipe(
        flatMap((dmDienThoai: HttpResponse<DmDienThoai>) => {
          if (dmDienThoai.body) {
            return of(dmDienThoai.body);
          } else {
            this.router.navigate(['404']);
            return EMPTY;
          }
        })
      );
    }
    return of(new DmDienThoai());
  }
}

export const dmLapTopRoute: Routes = [
  {
    path: '',
    component: DmLapTopComponent,
    data: {
      authorities: [Authority.USER],
      pageTitle: 'sophiaApp.dmLapTop.home.title',
    },
    canActivate: [UserRouteAccessService],
  },
];
