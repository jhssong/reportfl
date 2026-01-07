{
  "filepath": "/tmp/Lang-50b/src/java/org/apache/commons/lang/text/DefaultMetaFormatFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultMetaFormatFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 114,
      "comment": " package-private "
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_KEY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Number key "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_KEY"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Date key "
    },
    {
      "type": "field",
      "varNames": [
        "TIME_KEY"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Time key "
    },
    {
      "type": "field",
      "varNames": [
        "CHOICE_KEY"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Choice key "
    },
    {
      "type": "field",
      "varNames": [
        "NO_SUBFORMAT_KEYS"
      ],
      "begin_line": 53,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_PATTERN_KEYS"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PATTERN_KEYS"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "OrderedNameKeyedMetaFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.NameKeyedMetaFormat"
      ],
      "begin_line": 62,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat.OrderedNameKeyedMetaFormat(java.lang.String[], java.text.Format[])",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 68,col 45)",
        "(line 69,col 13)-(line 69,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat.createMap(java.lang.String[], java.text.Format[])",
      "begin_line": 72,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 69)",
        "(line 74,col 13)-(line 74,col 55)",
        "(line 75,col 13)-(line 77,col 13)",
        "(line 78,col 13)-(line 78,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat.iterateKeys()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DefaultMetaFormatFactory.getFormat(java.util.Locale)",
      "begin_line": 93,
      "end_line": 107,
      "comment": "\n     * Get a default metaformat for the specified Locale.\n     * \n     * @param locale\n     *            the Locale for the resulting Format instance.\n     * @return Format\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 50)",
        "(line 95,col 9)-(line 95,col 73)",
        "(line 96,col 9)-(line 96,col 73)",
        "(line 98,col 9)-(line 106,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DefaultMetaFormatFactory.getDefaultFormat(java.text.Format)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 51)",
        "(line 112,col 9)-(line 112,col 59)"
      ]
    }
  ]
}