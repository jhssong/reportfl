{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/exception/NestableException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NestableException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception",
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 89,
      "end_line": 258,
      "comment": "\n * The base class of all exceptions which can contain other exceptions.\n *\n * It is intended to ease the debugging by carrying on the information\n * about the exception which was caught and provoked throwing the\n * current exception. Catching and rethrowing may occur multiple\n * times, and provided that all exceptions except the first one\n * are descendants of \u003ccode\u003eNestedException\u003c/code\u003e, when the\n * exception is finally printed out using any of the \u003ccode\u003e\n * printStackTrace()\u003c/code\u003e methods, the stack trace will contain\n * the information about all exceptions thrown and caught on\n * the way.\n * \u003cp\u003e Running the following program\n * \u003cp\u003e\u003cblockquote\u003e\u003cpre\u003e\n *  1 import org.apache.commons.lang.exception.NestableException;\n *  2\n *  3 public class Test {\n *  4     public static void main( String[] args ) {\n *  5         try {\n *  6             a();\n *  7         } catch(Exception e) {\n *  8             e.printStackTrace();\n *  9         }\n * 10      }\n * 11\n * 12      public static void a() throws Exception {\n * 13          try {\n * 14              b();\n * 15          } catch(Exception e) {\n * 16              throw new NestableException(\"foo\", e);\n * 17          }\n * 18      }\n * 19\n * 20      public static void b() throws Exception {\n * 21          try {\n * 22              c();\n * 23          } catch(Exception e) {\n * 24              throw new NestableException(\"bar\", e);\n * 25          }\n * 26      }\n * 27\n * 28      public static void c() throws Exception {\n * 29          throw new Exception(\"baz\");\n * 30      }\n * 31 }\n * \u003c/pre\u003e\u003c/blockquote\u003e\n * \u003cp\u003eYields the following stack trace:\n * \u003cp\u003e\u003cblockquote\u003e\u003cpre\u003e\n * org.apache.commons.lang.exception.NestableException: foo\n *         at Test.a(Test.java:16)\n *         at Test.main(Test.java:6)\n * Caused by: org.apache.commons.lang.exception.NestableException: bar\n *         at Test.b(Test.java:24)\n *         at Test.a(Test.java:14)\n *         ... 1 more\n * Caused by: java.lang.Exception: baz\n *         at Test.c(Test.java:29)\n *         at Test.b(Test.java:22)\n *         ... 2 more\n * \u003c/pre\u003e\u003c/blockquote\u003e\u003cbr\u003e\n *\n * @author \u003ca href\u003d\"mailto:Rafal.Krzewski@e-point.pl\"\u003eRafal Krzewski\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:dlr@collab.net\"\u003eDaniel Rall\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:knielsen@apache.org\"\u003eKasper Nielsen\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * The helper instance which contains much of the code which we\n     * delegate to.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Holds the reference to the exception or error that caused\n     * this exception to be thrown.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableException.NestableException()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableException\u003c/code\u003e without specified\n     * detail message.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableException.NestableException(java.lang.String)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableException\u003c/code\u003e with specified\n     * detail message.\n     *\n     * @param msg The error message.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableException.NestableException(java.lang.Throwable)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @param cause the exception or error that caused this exception to be\n     * thrown\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 16)",
        "(line 137,col 9)-(line 137,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableException.NestableException(java.lang.String, java.lang.Throwable)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @param msg    the error message\n     * @param cause  the exception or error that caused this exception to be\n     * thrown\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 19)",
        "(line 150,col 9)-(line 150,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.getCause()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.getMessage()",
      "begin_line": 167,
      "end_line": 175,
      "comment": "\n     * Returns the detail message string of this throwable. If it was\n     * created with a null message, returns the following:\n     * (cause\u003d\u003dnull ? null : cause.toString()).\n     *\n     * @return String message string of the throwable\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.getMessage(int)",
      "begin_line": 180,
      "end_line": 186,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.getMessages()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.getThrowable(int)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.getThrowableCount()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.getThrowables()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.indexOfThrowable(java.lang.Class)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.printStackTrace()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.printStackTrace(java.io.PrintStream)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.printStackTrace(java.io.PrintWriter)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableException.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 35)"
      ]
    }
  ]
}