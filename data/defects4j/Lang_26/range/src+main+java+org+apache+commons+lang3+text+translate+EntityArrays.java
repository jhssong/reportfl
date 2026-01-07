{
  "filepath": "/tmp/Lang-26b/src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EntityArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 380,
      "comment": "\n * Class holding various entity data for HTML and XML - generally for use with \n * the LookupTranslator.\n * All arrays are of length [*][2].\n *\n * @author Apache Software Foundation\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE()",
      "begin_line": 30,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 30,col 51)-(line 30,col 82)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ISO8859_1_ESCAPE"
      ],
      "begin_line": 31,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE()",
      "begin_line": 130,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 130,col 53)-(line 130,col 86)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ISO8859_1_UNESCAPE"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE()",
      "begin_line": 134,
      "end_line": 134,
      "comment": " http://www.w3.org/TR/REC-html40/sgml/entities.html",
      "child_ranges": [
        "(line 134,col 57)-(line 134,col 94)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HTML40_EXTENDED_ESCAPE"
      ],
      "begin_line": 135,
      "end_line": 330,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE()",
      "begin_line": 332,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 332,col 59)-(line 332,col 98)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HTML40_EXTENDED_UNESCAPE"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()",
      "begin_line": 335,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 335,col 47)-(line 335,col 74)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BASIC_ESCAPE"
      ],
      "begin_line": 336,
      "end_line": 341,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()",
      "begin_line": 343,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 343,col 49)-(line 343,col 78)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BASIC_UNESCAPE"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()",
      "begin_line": 346,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 346,col 46)-(line 346,col 72)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "APOS_ESCAPE"
      ],
      "begin_line": 347,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE()",
      "begin_line": 351,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 351,col 48)-(line 351,col 76)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "APOS_UNESCAPE"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()",
      "begin_line": 354,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 354,col 57)-(line 354,col 94)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CTRL_CHARS_ESCAPE"
      ],
      "begin_line": 355,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE()",
      "begin_line": 363,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 363,col 59)-(line 363,col 98)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CTRL_CHARS_UNESCAPE"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.invert(java.lang.String[][])",
      "begin_line": 371,
      "end_line": 378,
      "comment": "\n     * Used to invert an escape array into an unescape array\n     * @param array String[][] to be inverted\n     * @return String[][] inverted array\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 58)",
        "(line 373,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 24)"
      ]
    }
  ]
}