{
  "filepath": "/tmp/Cli-39b/src/test/java/org/apache/commons/cli/OptionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TestOption",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.Option"
      ],
      "begin_line": 30,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.OptionTest.TestOption.TestOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 34,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 13)-(line 36,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.TestOption.addValue(java.lang.String)",
      "begin_line": 39,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 42,col 13)-(line 42,col 41)",
        "(line 43,col 13)-(line 43,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testClear()",
      "begin_line": 47,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 64)",
        "(line 51,col 9)-(line 51,col 55)",
        "(line 52,col 9)-(line 52,col 29)",
        "(line 53,col 9)-(line 53,col 55)",
        "(line 54,col 9)-(line 54,col 29)",
        "(line 55,col 9)-(line 55,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testClone()",
      "begin_line": 59,
      "end_line": 74,
      "comment": " See http://issues.apache.org/jira/browse/CLI-21",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 59)",
        "(line 63,col 9)-(line 63,col 52)",
        "(line 64,col 9)-(line 64,col 27)",
        "(line 65,col 9)-(line 65,col 28)",
        "(line 66,col 9)-(line 66,col 30)",
        "(line 67,col 9)-(line 67,col 45)",
        "(line 68,col 9)-(line 68,col 21)",
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 25)",
        "(line 71,col 9)-(line 71,col 37)",
        "(line 72,col 9)-(line 72,col 50)",
        "(line 73,col 9)-(line 73,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testHashCode()",
      "begin_line": 76,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 112)",
        "(line 79,col 9)-(line 79,col 121)",
        "(line 80,col 9)-(line 80,col 132)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultOption",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.Option"
      ],
      "begin_line": 83,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultValue"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.OptionTest.DefaultOption.DefaultOption(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 89,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 42)",
        "(line 92,col 13)-(line 92,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.DefaultOption.getValue()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testSubclass()",
      "begin_line": 102,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 75)",
        "(line 106,col 9)-(line 106,col 53)",
        "(line 107,col 9)-(line 107,col 53)",
        "(line 108,col 9)-(line 108,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testHasArgName()",
      "begin_line": 111,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 52)",
        "(line 116,col 9)-(line 116,col 32)",
        "(line 117,col 9)-(line 117,col 41)",
        "(line 119,col 9)-(line 119,col 30)",
        "(line 120,col 9)-(line 120,col 41)",
        "(line 122,col 9)-(line 122,col 34)",
        "(line 123,col 9)-(line 123,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testHasArgs()",
      "begin_line": 126,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 52)",
        "(line 131,col 9)-(line 131,col 26)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 134,col 9)-(line 134,col 26)",
        "(line 135,col 9)-(line 135,col 38)",
        "(line 137,col 9)-(line 137,col 27)",
        "(line 138,col 9)-(line 138,col 37)",
        "(line 140,col 9)-(line 140,col 48)",
        "(line 141,col 9)-(line 141,col 37)",
        "(line 143,col 9)-(line 143,col 45)",
        "(line 144,col 9)-(line 144,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testGetValue()",
      "begin_line": 147,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 52)",
        "(line 151,col 9)-(line 151,col 48)",
        "(line 153,col 9)-(line 153,col 60)",
        "(line 154,col 9)-(line 154,col 47)",
        "(line 156,col 9)-(line 156,col 44)",
        "(line 158,col 9)-(line 158,col 47)",
        "(line 159,col 9)-(line 159,col 48)",
        "(line 160,col 9)-(line 160,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testBuilderMethods()",
      "begin_line": 163,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 47)",
        "(line 168,col 9)-(line 169,col 105)",
        "(line 170,col 9)-(line 171,col 105)",
        "(line 172,col 9)-(line 173,col 106)",
        "(line 174,col 9)-(line 175,col 86)",
        "(line 176,col 9)-(line 177,col 105)",
        "(line 178,col 9)-(line 179,col 86)",
        "(line 180,col 9)-(line 181,col 86)",
        "(line 182,col 9)-(line 183,col 104)",
        "(line 184,col 9)-(line 185,col 105)",
        "(line 187,col 9)-(line 188,col 107)",
        "(line 189,col 9)-(line 190,col 105)",
        "(line 191,col 9)-(line 192,col 104)",
        "(line 193,col 9)-(line 194,col 92)",
        "(line 195,col 9)-(line 196,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testBuilderInsufficientParams1()",
      "begin_line": 199,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.testBuilderInsufficientParams2()",
      "begin_line": 205,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionTest.checkOption(org.apache.commons.cli.Option, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, boolean, char, java.lang.Class\u003c?\u003e)",
      "begin_line": 211,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 43)",
        "(line 216,col 9)-(line 216,col 59)",
        "(line 217,col 9)-(line 217,col 51)",
        "(line 218,col 9)-(line 218,col 48)",
        "(line 219,col 9)-(line 219,col 51)",
        "(line 220,col 9)-(line 220,col 52)",
        "(line 222,col 9)-(line 222,col 59)",
        "(line 223,col 9)-(line 223,col 65)",
        "(line 224,col 9)-(line 224,col 45)"
      ]
    }
  ]
}