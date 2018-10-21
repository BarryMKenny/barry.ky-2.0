import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class BackendAPIService {
  http: HttpClient;
  constructor(private _http: HttpClient) {
    this.http = _http;
  }

  getBackendName() {
    const url = '/api/name';
    return this.http.get<string>(url);
  }
}
