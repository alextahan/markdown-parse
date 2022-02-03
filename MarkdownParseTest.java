import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

//javac -cp ".;lib/\*" MarkdownParseTest.java       //or use ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar"
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks1() throws IOException{
        String file = Files.readString(Path.of("test-file.md"));
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(file));
    }

    @Test
    public void testGetLinks2() throws IOException{
        String file = Files.readString(Path.of("test-file-2.md"));
        assertEquals(List.of("something.html"), MarkdownParse.getLinks(file));
    }

    @Test
    public void testGetLinks3() throws IOException{
        String file = Files.readString(Path.of("test-file-3.md"));
        assertEquals(List.of("something.html"), MarkdownParse.getLinks(file));
    }

    @Test
    public void testGetLinks4() throws IOException{
        String file = Files.readString(Path.of("test-file-4.md"));
        assertEquals(List.of("something.html"), MarkdownParse.getLinks(file));
    }

    @Test
    public void test2() throws IOException{
        String file = Files.readString(Path.of("test-file2.md"));
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(file));
    }

    @Test
    public void test3() throws IOException{
        String file = Files.readString(Path.of("test-file3.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(file));
    }

    @Test
    public void test4() throws IOException{
        String file = Files.readString(Path.of("test-file4.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(file));
    }

    @Test
    public void test5() throws IOException{
        String file = Files.readString(Path.of("test-file5.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(file));
    }

    @Test
    public void test6() throws IOException{
        String file = Files.readString(Path.of("test-file6.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(file));
    }

    @Test
    public void test7() throws IOException{
        String file = Files.readString(Path.of("test-file7.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(file));
    }

    @Test
    public void test8() throws IOException{
        String file = Files.readString(Path.of("test-file8.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(file));
    }
    
}