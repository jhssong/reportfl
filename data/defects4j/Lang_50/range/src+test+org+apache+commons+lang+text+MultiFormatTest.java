{
  "filepath": "/tmp/Lang-50b/src/test/org/apache/commons/lang/text/MultiFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiFormatTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 133,
      "comment": "\n * Test MultiFormat\n * \n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "GuardedFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 43,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowableTypes"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.GuardedFormat.GuardedFormat(java.text.Format, java.lang.Class[])",
      "begin_line": 52,
      "end_line": 57,
      "comment": "\n         * Create a new MultiFormatTest.GuardedFormat.\n         ",
      "child_ranges": [
        "(line 53,col 13)-(line 53,col 39)",
        "(line 54,col 13)-(line 54,col 37)",
        "(line 55,col 13)-(line 55,col 45)",
        "(line 56,col 13)-(line 56,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.GuardedFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 59,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 61,col 13)-(line 61,col 58)",
        "(line 62,col 13)-(line 66,col 13)",
        "(line 67,col 13)-(line 67,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.GuardedFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.setUp()",
      "begin_line": 82,
      "end_line": 90,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see junit.framework.TestCase#setUp()\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 22)",
        "(line 86,col 9)-(line 89,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.testWTF()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 94,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.testFormatNumber()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.testParseNumber()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 103,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.testFormatDate()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 108,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.testParseDate()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 113,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.testFormatObject()",
      "begin_line": 116,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MultiFormatTest.testParseGarbage()",
      "begin_line": 125,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 131,col 9)"
      ]
    }
  ]
}