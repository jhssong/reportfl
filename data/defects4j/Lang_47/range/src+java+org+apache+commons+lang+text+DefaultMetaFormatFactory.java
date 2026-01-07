{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/text/DefaultMetaFormatFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultMetaFormatFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 139,
      "comment": "\n * Factory methods to produce metaformat instances that behave like\n * java.text.MessageFormat.\n * \n * @author Matt Benson\n * @since 2.4\n * @version $Id: DefaultMetaFormatFactory.java 592077 2007-11-05 16:47:10Z\n *          mbenson $\n "
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_KEY"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Number key "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_KEY"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Date key "
    },
    {
      "type": "field",
      "varNames": [
        "TIME_KEY"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Time key "
    },
    {
      "type": "field",
      "varNames": [
        "CHOICE_KEY"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Choice key "
    },
    {
      "type": "field",
      "varNames": [
        "NO_SUBFORMAT_KEYS"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_PATTERN_KEYS"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PATTERN_KEYS"
      ],
      "begin_line": 60,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "OrderedNameKeyedMetaFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.NameKeyedMetaFormat"
      ],
      "begin_line": 66,
      "end_line": 104,
      "comment": "\n     * Ordered NameKeyedMetaFormat\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat.OrderedNameKeyedMetaFormat(java.lang.String[], java.text.Format[])",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n         * Construct a new OrderedNameKeyedMetaFormat.\n         * \n         * @param names String[]\n         * @param formats Format[]\n         ",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 45)",
        "(line 79,col 13)-(line 79,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat.createMap(java.lang.String[], java.text.Format[])",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\n         * Create a map from the specified key/value parameters.\n         * \n         * @param names keys\n         * @param formats values\n         * @return Map\n         ",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 69)",
        "(line 91,col 13)-(line 91,col 55)",
        "(line 92,col 13)-(line 94,col 13)",
        "(line 95,col 13)-(line 95,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat.iterateKeys()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DefaultMetaFormatFactory.getFormat(java.util.Locale)",
      "begin_line": 112,
      "end_line": 126,
      "comment": "\n     * Get a default metaformat for the specified Locale.\n     * \n     * @param locale the Locale for the resulting Format instance.\n     * @return Format\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 50)",
        "(line 114,col 9)-(line 114,col 73)",
        "(line 115,col 9)-(line 115,col 73)",
        "(line 117,col 9)-(line 125,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DefaultMetaFormatFactory.getDefaultFormat(java.text.Format)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "\n     * Get the default format supported by a given metaformat.\n     * \n     * @param metaformat Format to handle parsing.\n     * @return the default format, if any.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 49)",
        "(line 136,col 9)-(line 136,col 51)",
        "(line 137,col 9)-(line 137,col 59)"
      ]
    }
  ]
}