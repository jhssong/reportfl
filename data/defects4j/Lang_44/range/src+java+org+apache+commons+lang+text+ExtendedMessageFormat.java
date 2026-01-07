{
  "filepath": "/tmp/Lang-44b/src/java/org/apache/commons/lang/text/ExtendedMessageFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedMessageFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.MessageFormat"
      ],
      "begin_line": 70,
      "end_line": 474,
      "comment": "\n * Extends \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e to allow pluggable/additional formatting\n * options for embedded format elements.  Client code should specify a registry\n * of \u003ccode\u003eFormatFactory\u003c/code\u003e instances associated with \u003ccode\u003eString\u003c/code\u003e\n * format names.  This registry will be consulted when the format elements are \n * parsed from the message pattern.  In this way custom patterns can be specified,\n * and the formats supported by \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e can be overridden\n * at the format and/or format style level (see MessageFormat).  A \"format element\"\n * embedded in the message pattern is specified (\u003cb\u003e()?\u003c/b\u003e signifies optionality):\u003cbr /\u003e\n * \u003ccode\u003e{\u003c/code\u003e\u003ci\u003eargument-number\u003c/i\u003e\u003cb\u003e(\u003c/b\u003e\u003ccode\u003e,\u003c/code\u003e\u003ci\u003eformat-name\u003c/i\u003e\u003cb\u003e(\u003c/b\u003e\u003ccode\u003e,\u003c/code\u003e\u003ci\u003eformat-style\u003c/i\u003e\u003cb\u003e)?)?\u003c/b\u003e\u003ccode\u003e}\u003c/code\u003e\n *\n * \u003cp\u003e\n * \u003ci\u003eformat-name\u003c/i\u003e and \u003ci\u003eformat-style\u003c/i\u003e values are trimmed of surrounding whitespace\n * in the manner of \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e.  If \u003ci\u003eformat-name\u003c/i\u003e denotes\n * \u003ccode\u003eFormatFactory formatFactoryInstance\u003c/code\u003e in \u003ccode\u003eregistry\u003c/code\u003e, a \u003ccode\u003eFormat\u003c/code\u003e\n * matching \u003ci\u003eformat-name\u003c/i\u003e and \u003ci\u003eformat-style\u003c/i\u003e is requested from\n * \u003ccode\u003eformatFactoryInstance\u003c/code\u003e.  If this is successful, the \u003ccode\u003eFormat\u003c/code\u003e\n * found is used for this format element.\n * \u003c/p\u003e\n *\n * \u003cp\u003eNOTICE: The various subformat mutator methods are considered unnecessary; they exist on the parent\n * class to allow the type of customization which it is the job of this class to provide in\n * a configurable fashion.  These methods have thus been disabled and will throw\n * \u003ccode\u003eUnsupportedOperationException\u003c/code\u003e if called.\n * \u003c/p\u003e\n * \n * \u003cp\u003eLimitations inherited from \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e:\n * \u003cul\u003e\n * \u003cli\u003eWhen using \"choice\" subformats, support for nested formatting instructions is limited\n *     to that provided by the base class.\u003c/li\u003e\n * \u003cli\u003eThread-safety of \u003ccode\u003eFormat\u003c/code\u003es, including \u003ccode\u003eMessageFormat\u003c/code\u003e and thus\n *     \u003ccode\u003eExtendedMessageFormat\u003c/code\u003e, is not guaranteed.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \n * @author Matt Benson\n * @author Niall Pemberton\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUMMY_PATTERN"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPED_QUOTE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FMT"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "END_FE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FE"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "toPattern"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Create a new ExtendedMessageFormat for the default locale.\n     * \n     * @param pattern String\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Locale)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern String\n     * @param locale Locale\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Map)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Create a new ExtendedMessageFormat for the default locale.\n     * \n     * @param pattern String\n     * @param registry Registry of format factories:  Map\u003cString, FormatFactory\u003e\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Locale, java.util.Map)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern String\n     * @param locale Locale\n     * @param registry Registry of format factories:  Map\u003cString, FormatFactory\u003e\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 29)",
        "(line 125,col 9)-(line 125,col 26)",
        "(line 126,col 9)-(line 126,col 33)",
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.toPattern()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern(java.lang.String)",
      "begin_line": 142,
      "end_line": 206,
      "comment": "\n     * Apply the specified pattern.\n     * \n     * @param pattern String\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 49)",
        "(line 149,col 9)-(line 149,col 54)",
        "(line 150,col 9)-(line 150,col 70)",
        "(line 152,col 9)-(line 152,col 49)",
        "(line 153,col 9)-(line 153,col 41)",
        "(line 154,col 9)-(line 154,col 25)",
        "(line 155,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 51)",
        "(line 192,col 9)-(line 192,col 72)",
        "(line 193,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.setFormat(int, java.text.Format)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.setFormatByArgumentIndex(int, java.text.Format)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.setFormats(java.text.Format[])",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.setFormatsByArgumentIndex(java.text.Format[])",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.getFormat(java.lang.String)",
      "begin_line": 246,
      "end_line": 261,
      "comment": "\n     * Get a custom format from a format description.\n     * \n     * @param desc String\n     * @return Format\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex(java.lang.String, java.text.ParsePosition)",
      "begin_line": 270,
      "end_line": 303,
      "comment": "\n     * Read the argument index from the current format element\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @return argument index\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 35)",
        "(line 272,col 9)-(line 272,col 32)",
        "(line 273,col 9)-(line 273,col 49)",
        "(line 274,col 9)-(line 274,col 30)",
        "(line 275,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 302,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.parseFormatDescription(java.lang.String, java.text.ParsePosition)",
      "begin_line": 312,
      "end_line": 335,
      "comment": "\n     * Parse the format component of a format element.\n     * \n     * @param pattern string to parse\n     * @param pos current parse position\n     * @return Format description String\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 35)",
        "(line 314,col 9)-(line 314,col 32)",
        "(line 315,col 9)-(line 315,col 34)",
        "(line 316,col 9)-(line 316,col 22)",
        "(line 317,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 334,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats(java.lang.String, java.util.ArrayList)",
      "begin_line": 344,
      "end_line": 379,
      "comment": "\n     * Insert formats back into the pattern for toPattern() support.\n     *\n     * @param pattern source\n     * @param customPatterns The custom patterns to re-insert, if any\n     * @return full pattern\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 65)",
        "(line 349,col 9)-(line 349,col 49)",
        "(line 350,col 9)-(line 350,col 20)",
        "(line 351,col 9)-(line 351,col 22)",
        "(line 352,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(java.lang.String, java.text.ParsePosition)",
      "begin_line": 387,
      "end_line": 394,
      "comment": "\n     * Consume whitespace from the current parse position.\n     * \n     * @param pattern String to read\n     * @param pos current position\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 20)",
        "(line 389,col 9)-(line 389,col 46)",
        "(line 390,col 9)-(line 393,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.next(java.text.ParsePosition)",
      "begin_line": 402,
      "end_line": 405,
      "comment": "\n     * Convenience method to advance parse position by 1\n     * \n     * @param pos ParsePosition\n     * @return \u003ccode\u003epos\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 41)",
        "(line 404,col 9)-(line 404,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuffer, boolean)",
      "begin_line": 417,
      "end_line": 444,
      "comment": "\n     * Consume a quoted string, adding it to \u003ccode\u003eappendTo\u003c/code\u003e if\n     * specified.\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @param appendTo optional StringBuffer to append\n     * @param escapingOn whether to process escaped quotes\n     * @return \u003ccode\u003eappendTo\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 35)",
        "(line 420,col 9)-(line 420,col 41)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 29)",
        "(line 425,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 443,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString(java.lang.String, java.text.ParsePosition, boolean)",
      "begin_line": 453,
      "end_line": 456,
      "comment": "\n     * Consume quoted string only\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @param escapingOn whether to process escaped quotes\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.containsElements(java.util.Collection)",
      "begin_line": 463,
      "end_line": 473,
      "comment": "\n     * Learn whether the specified Collection contains non-null elements.\n     * @param coll to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if some Object was found, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 21)"
      ]
    }
  ]
}