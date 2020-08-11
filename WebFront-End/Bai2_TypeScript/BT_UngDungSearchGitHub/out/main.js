var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
function fetchRepo() {
    return __awaiter(this, void 0, void 0, function* () {
        let repo = yield fetch(`https://api.github.com/search/repositories?q=CGDN`);
        console.log(repo);
        repo = (yield repo.json());
        console.log(repo.items);
        return repo.items;
    });
}
function createItem(text) {
    const item = document.createElement('li');
    item.textContent = text;
    return item;
}
const container = document.querySelector('.app .list');
function main() {
    return __awaiter(this, void 0, void 0, function* () {
        const clear = document.getElementById('list');
        clear.innerHTML = '';
        const repo = yield fetchRepo();
        repo.forEach((item) => {
            const li = createItem(item.name);
            container.appendChild(li);
        });
    });
}
main();
