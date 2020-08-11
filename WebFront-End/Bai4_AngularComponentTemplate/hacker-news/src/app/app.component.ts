import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hacker-news';
  article = {
    title: '',
    url: ''
  };
  articles = [
  ];
  addArticle() {
    // @ts-ignore
    this.article.title = document.getElementById('article-title').value;
    // @ts-ignore
    this.article.url = document.getElementById('article-url').value;
    this.articles.push(this.article);
  }
}
