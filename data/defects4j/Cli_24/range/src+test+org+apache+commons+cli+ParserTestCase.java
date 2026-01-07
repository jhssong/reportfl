{
  "filepath": "/tmp/Cli-24b/src/test/org/apache/commons/cli/ParserTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParserTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 306,
      "comment": "\n * Abstract test case testing common parser features.\n *\n * @author Emmanuel Bourg\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.setUp()",
      "begin_line": 37,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 42,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testSimpleShort()",
      "begin_line": 45,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 49,col 54)",
        "(line 51,col 9)-(line 51,col 53)",
        "(line 53,col 9)-(line 53,col 59)",
        "(line 54,col 9)-(line 54,col 59)",
        "(line 55,col 9)-(line 55,col 80)",
        "(line 56,col 9)-(line 56,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testSimpleLong()",
      "begin_line": 59,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 54)",
        "(line 65,col 9)-(line 65,col 53)",
        "(line 67,col 9)-(line 67,col 61)",
        "(line 68,col 9)-(line 68,col 61)",
        "(line 69,col 9)-(line 69,col 82)",
        "(line 70,col 9)-(line 70,col 95)",
        "(line 71,col 9)-(line 71,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMultiple()",
      "begin_line": 74,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 55)",
        "(line 80,col 9)-(line 80,col 59)",
        "(line 81,col 9)-(line 81,col 59)",
        "(line 82,col 9)-(line 82,col 100)",
        "(line 84,col 9)-(line 84,col 49)",
        "(line 86,col 9)-(line 86,col 64)",
        "(line 87,col 9)-(line 87,col 59)",
        "(line 88,col 9)-(line 88,col 80)",
        "(line 89,col 9)-(line 89,col 99)",
        "(line 90,col 9)-(line 90,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMultipleWithLong()",
      "begin_line": 93,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 60)",
        "(line 99,col 9)-(line 99,col 59)",
        "(line 100,col 9)-(line 100,col 59)",
        "(line 101,col 9)-(line 101,col 100)",
        "(line 103,col 9)-(line 103,col 49)",
        "(line 105,col 9)-(line 105,col 64)",
        "(line 106,col 9)-(line 106,col 59)",
        "(line 107,col 9)-(line 107,col 80)",
        "(line 108,col 9)-(line 108,col 99)",
        "(line 109,col 9)-(line 109,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnrecognizedOption()",
      "begin_line": 112,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 81)",
        "(line 116,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMissingArg()",
      "begin_line": 127,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 46)",
        "(line 131,col 9)-(line 131,col 31)",
        "(line 133,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testDoubleDash()",
      "begin_line": 146,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 55)",
        "(line 152,col 9)-(line 152,col 53)",
        "(line 154,col 9)-(line 154,col 59)",
        "(line 155,col 9)-(line 155,col 64)",
        "(line 156,col 9)-(line 156,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testSingleDash()",
      "begin_line": 159,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 164,col 45)",
        "(line 166,col 9)-(line 166,col 53)",
        "(line 168,col 9)-(line 168,col 59)",
        "(line 169,col 9)-(line 169,col 59)",
        "(line 170,col 9)-(line 170,col 76)",
        "(line 171,col 9)-(line 171,col 98)",
        "(line 172,col 9)-(line 172,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtUnexpectedArg()",
      "begin_line": 175,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 180,col 49)",
        "(line 182,col 9)-(line 182,col 59)",
        "(line 183,col 9)-(line 183,col 59)",
        "(line 184,col 9)-(line 184,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtExpectedArg()",
      "begin_line": 187,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 50)",
        "(line 191,col 9)-(line 191,col 59)",
        "(line 193,col 9)-(line 193,col 59)",
        "(line 194,col 9)-(line 194,col 73)",
        "(line 195,col 9)-(line 195,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtNonOptionShort()",
      "begin_line": 198,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 48)",
        "(line 204,col 9)-(line 204,col 59)",
        "(line 205,col 9)-(line 205,col 64)",
        "(line 206,col 9)-(line 206,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtNonOptionLong()",
      "begin_line": 209,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 48)",
        "(line 215,col 9)-(line 215,col 59)",
        "(line 217,col 9)-(line 217,col 64)",
        "(line 218,col 9)-(line 218,col 64)",
        "(line 219,col 9)-(line 219,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testNegativeArgument()",
      "begin_line": 222,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 52)",
        "(line 226,col 9)-(line 226,col 53)",
        "(line 227,col 9)-(line 227,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testArgumentStartingWithHyphen()",
      "begin_line": 230,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 51)",
        "(line 234,col 9)-(line 234,col 53)",
        "(line 235,col 9)-(line 235,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testShortWithEqual()",
      "begin_line": 238,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 50)",
        "(line 242,col 9)-(line 242,col 40)",
        "(line 243,col 9)-(line 243,col 81)",
        "(line 245,col 9)-(line 245,col 53)",
        "(line 247,col 9)-(line 247,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testShortWithoutEqual()",
      "begin_line": 250,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 49)",
        "(line 254,col 9)-(line 254,col 40)",
        "(line 255,col 9)-(line 255,col 81)",
        "(line 257,col 9)-(line 257,col 53)",
        "(line 259,col 9)-(line 259,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testLongWithEqual()",
      "begin_line": 262,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 53)",
        "(line 266,col 9)-(line 266,col 40)",
        "(line 267,col 9)-(line 267,col 81)",
        "(line 269,col 9)-(line 269,col 53)",
        "(line 271,col 9)-(line 271,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testLongWithEqualSingleDash()",
      "begin_line": 274,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 52)",
        "(line 278,col 9)-(line 278,col 40)",
        "(line 279,col 9)-(line 279,col 81)",
        "(line 281,col 9)-(line 281,col 53)",
        "(line 283,col 9)-(line 283,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertiesOption()",
      "begin_line": 286,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 86)",
        "(line 290,col 9)-(line 290,col 40)",
        "(line 291,col 9)-(line 291,col 85)",
        "(line 293,col 9)-(line 293,col 53)",
        "(line 295,col 9)-(line 295,col 61)",
        "(line 296,col 9)-(line 296,col 45)",
        "(line 297,col 9)-(line 297,col 59)",
        "(line 298,col 9)-(line 298,col 57)",
        "(line 299,col 9)-(line 299,col 54)",
        "(line 300,col 9)-(line 300,col 57)",
        "(line 301,col 9)-(line 301,col 54)",
        "(line 302,col 9)-(line 302,col 40)",
        "(line 303,col 9)-(line 303,col 63)",
        "(line 304,col 9)-(line 304,col 60)"
      ]
    }
  ]
}