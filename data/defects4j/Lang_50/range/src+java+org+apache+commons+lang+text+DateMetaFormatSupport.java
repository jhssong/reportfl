{
  "filepath": "/tmp/Lang-50b/src/java/org/apache/commons/lang/text/DateMetaFormatSupport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateMetaFormatSupport",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.MetaFormatSupport"
      ],
      "begin_line": 37,
      "end_line": 231,
      "comment": "\n * date/time metaFormat support.\n * @see {@link ExtendedMessageFormat}\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " \"Default\" subformat name "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " \"Short\" subformat name "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " \"Medium\" subformat name "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " \"Long\" subformat name "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " \"Full\" subformat name "
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "handlePatterns"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initialized"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "styleMap"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inverseStyleMap"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subformats"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverseSubformats"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateFormatSymbols"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.DateMetaFormatSupport()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Create a new AbstractDateMetaFormat.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.DateMetaFormatSupport(java.util.Locale)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Create a new AbstractDateMetaFormat.\n     * \n     * @param locale\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 16)",
        "(line 77,col 9)-(line 77,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 86,
      "end_line": 99,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer,\n     *      java.text.FieldPosition)\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 49)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.getSubformatName(java.lang.Object)",
      "begin_line": 101,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 21)",
        "(line 103,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 116,
      "end_line": 132,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.text.Format#parseObject(java.lang.String,\n     *      java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 35)",
        "(line 118,col 9)-(line 118,col 42)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 74)",
        "(line 123,col 9)-(line 123,col 48)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 33)",
        "(line 131,col 9)-(line 131,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.getSubformat(java.lang.String)",
      "begin_line": 134,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 21)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 21)",
        "(line 140,col 9)-(line 140,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.getLocale()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Get the locale in use by this {@link DateMetaFormatSupport}.\n     * \n     * @return Locale\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.initialize()",
      "begin_line": 152,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.createSubformatInstance(int)",
      "begin_line": 181,
      "end_line": 181,
      "comment": "\n     * Create a subformat for the given \u003ccode\u003eDateFormat\u003c/code\u003e style\n     * constant.\n     * \n     * @param style\n     * @return a DateFormat instance.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.isHandlePatterns()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Get whether this metaformat can parse date/time pattern formats in\n     * addition to named formats.\n     * \n     * @return boolean.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.setHandlePatterns(boolean)",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * Set whether this metaformat can parse date/time pattern formats in\n     * addition to named formats.\n     * \n     * @param handlePatterns\n     *            the boolean handlePatterns to set.\n     * @return \u003ccode\u003ethis\u003c/code\u003e for fluent usage.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 45)",
        "(line 203,col 9)-(line 203,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.createStyleMap()",
      "begin_line": 211,
      "end_line": 219,
      "comment": "\n     * Create the style map.\n     * \n     * @return Map\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 39)",
        "(line 213,col 9)-(line 213,col 57)",
        "(line 214,col 9)-(line 214,col 59)",
        "(line 215,col 9)-(line 215,col 55)",
        "(line 216,col 9)-(line 216,col 55)",
        "(line 217,col 9)-(line 217,col 61)",
        "(line 218,col 9)-(line 218,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.createInverseStyleMap()",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\n     * Create the inverse style map.\n     * \n     * @return Map\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 40)",
        "(line 228,col 9)-(line 228,col 33)",
        "(line 229,col 9)-(line 229,col 32)"
      ]
    }
  ]
}