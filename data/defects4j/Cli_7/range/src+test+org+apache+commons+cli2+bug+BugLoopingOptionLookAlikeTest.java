{
  "filepath": "/tmp/Cli-7b/src/test/org/apache/commons/cli2/bug/BugLoopingOptionLookAlikeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BugLoopingOptionLookAlikeTest",
      "is_interface": false,
      "parent_types": [
        "junit.framework.TestCase"
      ],
      "begin_line": 39,
      "end_line": 79,
      "comment": "\r\n * The first is a loop in Parser.parse() if I set a non-declared option. This \r\n * code goes into a loop in Parser.java method parse this while loop runs \r\n * endless\r\n * \r\n * @author Steve Alberty\r\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugLoopingOptionLookAlikeTest.testLoopingOptionLookAlike()",
      "begin_line": 41,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 73)",
        "(line 43,col 9)-(line 43,col 63)",
        "(line 44,col 9)-(line 44,col 57)",
        "(line 45,col 9)-(line 50,col 22)",
        "(line 52,col 9)-(line 52,col 43)",
        "(line 53,col 9)-(line 53,col 33)",
        "(line 54,col 9)-(line 60,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.bug.BugLoopingOptionLookAlikeTest.testLoopingOptionLookAlike2()",
      "begin_line": 63,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 63)",
        "(line 65,col 9)-(line 65,col 57)",
        "(line 66,col 9)-(line 66,col 105)",
        "(line 67,col 9)-(line 67,col 107)",
        "(line 68,col 9)-(line 68,col 87)",
        "(line 69,col 9)-(line 69,col 68)",
        "(line 70,col 9)-(line 70,col 43)",
        "(line 71,col 9)-(line 71,col 33)",
        "(line 72,col 9)-(line 77,col 9)"
      ]
    }
  ]
}