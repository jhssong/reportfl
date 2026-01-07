{
  "filepath": "/tmp/Cli-36b/src/test/java/org/apache/commons/cli/OptionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TestOption",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.Option"
      ],
      "begin_line": 29,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.OptionTest.TestOption.TestOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 33,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 13)-(line 35,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.TestOption.addValue(java.lang.String)",
      "begin_line": 38,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 41)",
        "(line 42,col 13)-(line 42,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testClear()",
      "begin_line": 46,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 58)",
        "(line 50,col 9)-(line 50,col 55)",
        "(line 51,col 9)-(line 51,col 29)",
        "(line 52,col 9)-(line 52,col 55)",
        "(line 53,col 9)-(line 53,col 29)",
        "(line 54,col 9)-(line 54,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testClone()",
      "begin_line": 58,
      "end_line": 73,
      "comment": " See http://issues.apache.org/jira/browse/CLI-21",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 53)",
        "(line 62,col 9)-(line 62,col 46)",
        "(line 63,col 9)-(line 63,col 27)",
        "(line 64,col 9)-(line 64,col 28)",
        "(line 65,col 9)-(line 65,col 30)",
        "(line 66,col 9)-(line 66,col 45)",
        "(line 67,col 9)-(line 67,col 21)",
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 37)",
        "(line 71,col 9)-(line 71,col 50)",
        "(line 72,col 9)-(line 72,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultOption",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.Option"
      ],
      "begin_line": 75,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultValue"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.OptionTest.DefaultOption.DefaultOption(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 42)",
        "(line 84,col 13)-(line 84,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.DefaultOption.getValue()",
      "begin_line": 87,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testSubclass()",
      "begin_line": 94,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 69)",
        "(line 98,col 9)-(line 98,col 47)",
        "(line 99,col 9)-(line 99,col 53)",
        "(line 100,col 9)-(line 100,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testHasArgName()",
      "begin_line": 103,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 46)",
        "(line 108,col 9)-(line 108,col 32)",
        "(line 109,col 9)-(line 109,col 41)",
        "(line 111,col 9)-(line 111,col 30)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 114,col 9)-(line 114,col 34)",
        "(line 115,col 9)-(line 115,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testHasArgs()",
      "begin_line": 118,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 46)",
        "(line 123,col 9)-(line 123,col 26)",
        "(line 124,col 9)-(line 124,col 38)",
        "(line 126,col 9)-(line 126,col 26)",
        "(line 127,col 9)-(line 127,col 38)",
        "(line 129,col 9)-(line 129,col 27)",
        "(line 130,col 9)-(line 130,col 37)",
        "(line 132,col 9)-(line 132,col 48)",
        "(line 133,col 9)-(line 133,col 37)",
        "(line 135,col 9)-(line 135,col 45)",
        "(line 136,col 9)-(line 136,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testGetValue()",
      "begin_line": 139,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 46)",
        "(line 143,col 9)-(line 143,col 48)",
        "(line 145,col 9)-(line 145,col 60)",
        "(line 146,col 9)-(line 146,col 47)",
        "(line 148,col 9)-(line 148,col 44)",
        "(line 150,col 9)-(line 150,col 47)",
        "(line 151,col 9)-(line 151,col 48)",
        "(line 152,col 9)-(line 152,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testBuilderMethods()",
      "begin_line": 155,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 41)",
        "(line 160,col 9)-(line 161,col 105)",
        "(line 162,col 9)-(line 163,col 105)",
        "(line 164,col 9)-(line 165,col 106)",
        "(line 166,col 9)-(line 167,col 86)",
        "(line 168,col 9)-(line 169,col 105)",
        "(line 170,col 9)-(line 171,col 86)",
        "(line 172,col 9)-(line 173,col 86)",
        "(line 174,col 9)-(line 175,col 104)",
        "(line 176,col 9)-(line 177,col 105)",
        "(line 179,col 9)-(line 180,col 107)",
        "(line 181,col 9)-(line 182,col 105)",
        "(line 183,col 9)-(line 184,col 104)",
        "(line 185,col 9)-(line 186,col 92)",
        "(line 187,col 9)-(line 188,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testBuilderInsufficientParams1()",
      "begin_line": 191,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testBuilderInsufficientParams2()",
      "begin_line": 197,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.checkOption(org.apache.commons.cli.Option, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, boolean, char, java.lang.Class\u003c?\u003e)",
      "begin_line": 203,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 43)",
        "(line 208,col 9)-(line 208,col 59)",
        "(line 209,col 9)-(line 209,col 51)",
        "(line 210,col 9)-(line 210,col 48)",
        "(line 211,col 9)-(line 211,col 51)",
        "(line 212,col 9)-(line 212,col 52)",
        "(line 214,col 9)-(line 214,col 59)",
        "(line 215,col 9)-(line 215,col 65)",
        "(line 216,col 9)-(line 216,col 45)"
      ]
    }
  ]
}