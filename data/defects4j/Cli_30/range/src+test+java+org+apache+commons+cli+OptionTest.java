{
  "filepath": "/tmp/Cli-30b/src/test/java/org/apache/commons/cli/OptionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 25,
      "end_line": 140,
      "comment": "\n * @author brianegge\n "
    },
    {
      "type": "class_interface",
      "name": "TestOption",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.Option"
      ],
      "begin_line": 27,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.OptionTest.TestOption.TestOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 29,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 13)-(line 31,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.TestOption.addValue(java.lang.String)",
      "begin_line": 34,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 36,col 13)-(line 36,col 41)",
        "(line 37,col 13)-(line 37,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testClear()",
      "begin_line": 41,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 58)",
        "(line 44,col 9)-(line 44,col 55)",
        "(line 45,col 9)-(line 45,col 29)",
        "(line 46,col 9)-(line 46,col 55)",
        "(line 47,col 9)-(line 47,col 29)",
        "(line 48,col 9)-(line 48,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testClone()",
      "begin_line": 52,
      "end_line": 66,
      "comment": " See http://issues.apache.org/jira/browse/CLI-21",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 53)",
        "(line 55,col 9)-(line 55,col 46)",
        "(line 56,col 9)-(line 56,col 27)",
        "(line 57,col 9)-(line 57,col 28)",
        "(line 58,col 9)-(line 58,col 30)",
        "(line 59,col 9)-(line 59,col 45)",
        "(line 60,col 9)-(line 60,col 21)",
        "(line 61,col 9)-(line 61,col 25)",
        "(line 62,col 9)-(line 62,col 25)",
        "(line 63,col 9)-(line 63,col 37)",
        "(line 64,col 9)-(line 64,col 50)",
        "(line 65,col 9)-(line 65,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultOption",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.Option"
      ],
      "begin_line": 68,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultValue"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.OptionTest.DefaultOption.DefaultOption(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 42)",
        "(line 75,col 13)-(line 75,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.DefaultOption.getValue()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testSubclass()",
      "begin_line": 84,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 69)",
        "(line 87,col 9)-(line 87,col 47)",
        "(line 88,col 9)-(line 88,col 53)",
        "(line 89,col 9)-(line 89,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testHasArgName()",
      "begin_line": 92,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 46)",
        "(line 96,col 9)-(line 96,col 32)",
        "(line 97,col 9)-(line 97,col 41)",
        "(line 99,col 9)-(line 99,col 30)",
        "(line 100,col 9)-(line 100,col 41)",
        "(line 102,col 9)-(line 102,col 34)",
        "(line 103,col 9)-(line 103,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testHasArgs()",
      "begin_line": 106,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 46)",
        "(line 110,col 9)-(line 110,col 26)",
        "(line 111,col 9)-(line 111,col 38)",
        "(line 113,col 9)-(line 113,col 26)",
        "(line 114,col 9)-(line 114,col 38)",
        "(line 116,col 9)-(line 116,col 27)",
        "(line 117,col 9)-(line 117,col 37)",
        "(line 119,col 9)-(line 119,col 48)",
        "(line 120,col 9)-(line 120,col 37)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 123,col 9)-(line 123,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testGetValue()",
      "begin_line": 126,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 46)",
        "(line 129,col 9)-(line 129,col 48)",
        "(line 131,col 9)-(line 131,col 60)",
        "(line 132,col 9)-(line 132,col 47)",
        "(line 134,col 9)-(line 134,col 44)",
        "(line 136,col 9)-(line 136,col 47)",
        "(line 137,col 9)-(line 137,col 48)",
        "(line 138,col 9)-(line 138,col 56)"
      ]
    }
  ]
}