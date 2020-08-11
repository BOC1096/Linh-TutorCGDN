interface ISingleRepo {
    name: string;
}
interface IRepos {
    items: Array<ISingleRepo>;
}

async function fetchRepo(): Promise<Array<ISingleRepo>> {
    let repo: Response | IRepos = await fetch(`https://api.github.com/search/repositories?q=CGDN`);
    console.log(repo);
    repo = await repo.json() as IRepos;
    console.log(repo.items);
    return repo.items;
}
function createItem(text: string): HTMLElement {
    const item = document.createElement('li') as HTMLElement;
    item.textContent = text;
    return item;
}
const container = document.querySelector('.app .list');

async function main() {
    const clear = document.getElementById('list');
    clear.innerHTML = '';
    const repo = await fetchRepo();
    repo.forEach((item: any) => {
        const li = createItem(item.name);
        container.appendChild(li);
    });
}
main();

