{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/text/translate/UnescapeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnescapeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 129,
      "comment": "\n * Helper class defining various standard language unescape functions. \n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_JAVA"
      ],
      "begin_line": 33,
      "end_line": 44,
      "comment": " throw \"illegal character: \\92\" as an Exception if a \\ on the end of the Java (as per the compiler)?"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.UnescapeUtils.unescapeJava(java.lang.String)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 46)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_ECMASCRIPT"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.UnescapeUtils.unescapeEcmaScript(java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 52)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_HTML3"
      ],
      "begin_line": 56,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.UnescapeUtils.unescapeHtml3(java.lang.String)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_HTML4"
      ],
      "begin_line": 67,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.UnescapeUtils.unescapeHtml4(java.lang.String)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_XML"
      ],
      "begin_line": 79,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.UnescapeUtils.unescapeXml(java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_CSV"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.UnescapeUtils.unescapeCsv(java.lang.String)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CsvUnescaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 96,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_DELIMITER"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE_STR"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_SEARCH_CHARS"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 104,
      "end_line": 126,
      "comment": " TODO: Replace with a RegexTranslator. That should consume the number of characters the regex uses up?",
      "child_ranges": [
        "(line 107,col 13)-(line 109,col 13)",
        "(line 111,col 13)-(line 114,col 13)",
        "(line 117,col 13)-(line 117,col 83)",
        "(line 119,col 13)-(line 124,col 13)",
        "(line 125,col 13)-(line 125,col 34)"
      ]
    }
  ]
}