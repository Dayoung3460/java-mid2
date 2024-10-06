package collection.deque.test.stack;

import java.util.ArrayDeque;

public class BrowserHistory {
    private ArrayDeque<String> pages = new ArrayDeque<String>();

    public void visitPage(String page) {
        pages.push(page);
    }

    public String goBack() {
        pages.pop();
        return pages.peek();
    }
}
