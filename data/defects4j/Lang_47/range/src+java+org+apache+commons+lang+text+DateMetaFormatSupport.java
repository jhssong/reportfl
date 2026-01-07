{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/text/DateMetaFormatSupport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateMetaFormatSupport",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.MetaFormatSupport"
      ],
      "begin_line": 38,
      "end_line": 240,
      "comment": "\n * date/time metaFormat support.\n * \n * @see ExtendedMessageFormat\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " \"Default\" subformat name "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " \"Short\" subformat name "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " \"Medium\" subformat name "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " \"Long\" subformat name "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " \"Full\" subformat name "
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "handlePatterns"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initialized"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "styleMap"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inverseStyleMap"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subformats"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverseSubformats"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateFormatSymbols"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.DateMetaFormatSupport()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Create a new AbstractDateMetaFormat.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.DateMetaFormatSupport(java.util.Locale)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Create a new AbstractDateMetaFormat.\n     * \n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 16)",
        "(line 78,col 9)-(line 78,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 84,
      "end_line": 97,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 49)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.getSubformatName(java.lang.Object)",
      "begin_line": 105,
      "end_line": 112,
      "comment": "\n     * Get the subformat name for the given object.\n     * \n     * @param subformat Object\n     * @return subformat name.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 21)",
        "(line 107,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 117,
      "end_line": 133,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 35)",
        "(line 119,col 9)-(line 119,col 42)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 74)",
        "(line 124,col 9)-(line 124,col 48)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 33)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.getSubformat(java.lang.String)",
      "begin_line": 141,
      "end_line": 148,
      "comment": "\n     * Get the named subformat.\n     * \n     * @param subformat name\n     * @return Format designated by \u003ccode\u003ename\u003c/code\u003e, if any\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 21)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 21)",
        "(line 147,col 9)-(line 147,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.getLocale()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Get the locale in use by this DateMetaFormatSupport.\n     * \n     * @return Locale\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.initialize()",
      "begin_line": 162,
      "end_line": 182,
      "comment": "\n     * Initialize this DateMetaFormatSupport.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.createSubformatInstance(int)",
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * Create a subformat for the given \u003ccode\u003eDateFormat\u003c/code\u003e style\n     * constant.\n     * \n     * @param style DateFormat style constant\n     * @return a DateFormat instance.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.isHandlePatterns()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Get whether this metaformat can parse date/time pattern formats in\n     * addition to named formats.\n     * \n     * @return boolean.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.setHandlePatterns(boolean)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n     * Set whether this metaformat can parse date/time pattern formats in\n     * addition to named formats.\n     * \n     * @param handlePatterns the boolean handlePatterns to set.\n     * @return \u003ccode\u003ethis\u003c/code\u003e for fluent usage.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 45)",
        "(line 212,col 9)-(line 212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.createStyleMap()",
      "begin_line": 220,
      "end_line": 228,
      "comment": "\n     * Create the style map.\n     * \n     * @return Map\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 39)",
        "(line 222,col 9)-(line 222,col 57)",
        "(line 223,col 9)-(line 223,col 59)",
        "(line 224,col 9)-(line 224,col 55)",
        "(line 225,col 9)-(line 225,col 55)",
        "(line 226,col 9)-(line 226,col 61)",
        "(line 227,col 9)-(line 227,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.DateMetaFormatSupport.createInverseStyleMap()",
      "begin_line": 235,
      "end_line": 239,
      "comment": "\n     * Create the inverse style map.\n     * \n     * @return Map\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 40)",
        "(line 237,col 9)-(line 237,col 33)",
        "(line 238,col 9)-(line 238,col 32)"
      ]
    }
  ]
}