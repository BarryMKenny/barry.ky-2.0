import { BackendAPIService } from "../service/backend-api-service";
import {Component, OnInit} from "@angular/core";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'frontend';

  constructor(private backendApiService: BackendAPIService){}

  ngOnInit() {
    this.backendApiService.getBackendName().subscribe(name => {
      this.title = name;
    })
  }
}
