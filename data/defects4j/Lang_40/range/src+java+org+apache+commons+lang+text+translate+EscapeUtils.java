{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/text/translate/EscapeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EscapeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 133,
      "comment": "\n * Helper class defining various standard language escape functions. \n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_JAVA"
      ],
      "begin_line": 32,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.EscapeUtils.escapeJava(java.lang.String)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_ECMASCRIPT"
      ],
      "begin_line": 47,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.EscapeUtils.escapeEcmaScript(java.lang.String)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_XML"
      ],
      "begin_line": 64,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.EscapeUtils.escapeXml(java.lang.String)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_HTML3"
      ],
      "begin_line": 75,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.EscapeUtils.escapeHtml3(java.lang.String)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_HTML4"
      ],
      "begin_line": 86,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.EscapeUtils.escapeHtml4(java.lang.String)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_CSV"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.EscapeUtils.escapeCsv(java.lang.String)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CsvEscaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 107,
      "end_line": 131,
      "comment": " TODO: could also have an optimization check method."
    },
    {
      "type": "field",
      "varNames": [
        "CSV_DELIMITER"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE_STR"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_SEARCH_CHARS"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 115,
      "end_line": 130,
      "comment": " TODO: Replace with a RegexTranslator. That should consume the number of characters the regex uses up?",
      "child_ranges": [
        "(line 118,col 13)-(line 120,col 13)",
        "(line 122,col 13)-(line 128,col 13)",
        "(line 129,col 13)-(line 129,col 34)"
      ]
    }
  ]
}