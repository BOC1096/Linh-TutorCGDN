import {Component, Input, OnInit} from '@angular/core';
import {IArticle} from '../IArticle';

@Component({
  selector: 'app-article-detail',
  templateUrl: './article-detail.component.html',
})
export class ArticleDetailComponent implements OnInit {

  @Input()
  title = 'Hello';
  constructor() { }

  ngOnInit() {
  }

}
