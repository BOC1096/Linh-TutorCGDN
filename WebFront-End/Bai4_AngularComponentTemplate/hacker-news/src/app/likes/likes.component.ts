import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-likes',
  templateUrl: './likes.component.html',
})
export class LikesComponent implements OnInit {

  likes = 0;

  likeThis() {
    this.likes++;
  }
  constructor() { }

  ngOnInit() {
  }

}
