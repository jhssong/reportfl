{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EntityArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 379,
      "comment": "\n * Class holding various entity data for HTML and XML - generally for use with \n * the LookupTranslator.\n * All arrays are of length [*][2].\n *\n * @author Apache Software Foundation\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE()",
      "begin_line": 29,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 29,col 51)-(line 29,col 82)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ISO8859_1_ESCAPE"
      ],
      "begin_line": 30,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE()",
      "begin_line": 129,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 129,col 53)-(line 129,col 86)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ISO8859_1_UNESCAPE"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE()",
      "begin_line": 133,
      "end_line": 133,
      "comment": " http://www.w3.org/TR/REC-html40/sgml/entities.html",
      "child_ranges": [
        "(line 133,col 57)-(line 133,col 94)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HTML40_EXTENDED_ESCAPE"
      ],
      "begin_line": 134,
      "end_line": 329,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE()",
      "begin_line": 331,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 331,col 59)-(line 331,col 98)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HTML40_EXTENDED_UNESCAPE"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()",
      "begin_line": 334,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 334,col 47)-(line 334,col 74)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BASIC_ESCAPE"
      ],
      "begin_line": 335,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()",
      "begin_line": 342,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 342,col 49)-(line 342,col 78)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BASIC_UNESCAPE"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()",
      "begin_line": 345,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 345,col 46)-(line 345,col 72)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "APOS_ESCAPE"
      ],
      "begin_line": 346,
      "end_line": 348,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE()",
      "begin_line": 350,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 350,col 48)-(line 350,col 76)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "APOS_UNESCAPE"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()",
      "begin_line": 353,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 353,col 57)-(line 353,col 94)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CTRL_CHARS_ESCAPE"
      ],
      "begin_line": 354,
      "end_line": 360,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE()",
      "begin_line": 362,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 362,col 59)-(line 362,col 98)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CTRL_CHARS_UNESCAPE"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.invert(java.lang.String[][])",
      "begin_line": 370,
      "end_line": 377,
      "comment": "\n     * Used to invert an escape array into an unescape array\n     * @param array String[][] to be inverted\n     * @return String[][] inverted array\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 58)",
        "(line 372,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 24)"
      ]
    }
  ]
}