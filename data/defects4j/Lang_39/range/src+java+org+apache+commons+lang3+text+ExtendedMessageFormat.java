{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedMessageFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.MessageFormat"
      ],
      "begin_line": 71,
      "end_line": 482,
      "comment": "\n * Extends \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e to allow pluggable/additional formatting\n * options for embedded format elements.  Client code should specify a registry\n * of \u003ccode\u003eFormatFactory\u003c/code\u003e instances associated with \u003ccode\u003eString\u003c/code\u003e\n * format names.  This registry will be consulted when the format elements are \n * parsed from the message pattern.  In this way custom patterns can be specified,\n * and the formats supported by \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e can be overridden\n * at the format and/or format style level (see MessageFormat).  A \"format element\"\n * embedded in the message pattern is specified (\u003cb\u003e()?\u003c/b\u003e signifies optionality):\u003cbr /\u003e\n * \u003ccode\u003e{\u003c/code\u003e\u003ci\u003eargument-number\u003c/i\u003e\u003cb\u003e(\u003c/b\u003e\u003ccode\u003e,\u003c/code\u003e\u003ci\u003eformat-name\u003c/i\u003e\u003cb\u003e(\u003c/b\u003e\u003ccode\u003e,\u003c/code\u003e\u003ci\u003eformat-style\u003c/i\u003e\u003cb\u003e)?)?\u003c/b\u003e\u003ccode\u003e}\u003c/code\u003e\n *\n * \u003cp\u003e\n * \u003ci\u003eformat-name\u003c/i\u003e and \u003ci\u003eformat-style\u003c/i\u003e values are trimmed of surrounding whitespace\n * in the manner of \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e.  If \u003ci\u003eformat-name\u003c/i\u003e denotes\n * \u003ccode\u003eFormatFactory formatFactoryInstance\u003c/code\u003e in \u003ccode\u003eregistry\u003c/code\u003e, a \u003ccode\u003eFormat\u003c/code\u003e\n * matching \u003ci\u003eformat-name\u003c/i\u003e and \u003ci\u003eformat-style\u003c/i\u003e is requested from\n * \u003ccode\u003eformatFactoryInstance\u003c/code\u003e.  If this is successful, the \u003ccode\u003eFormat\u003c/code\u003e\n * found is used for this format element.\n * \u003c/p\u003e\n *\n * \u003cp\u003eNOTICE: The various subformat mutator methods are considered unnecessary; they exist on the parent\n * class to allow the type of customization which it is the job of this class to provide in\n * a configurable fashion.  These methods have thus been disabled and will throw\n * \u003ccode\u003eUnsupportedOperationException\u003c/code\u003e if called.\n * \u003c/p\u003e\n * \n * \u003cp\u003eLimitations inherited from \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e:\n * \u003cul\u003e\n * \u003cli\u003eWhen using \"choice\" subformats, support for nested formatting instructions is limited\n *     to that provided by the base class.\u003c/li\u003e\n * \u003cli\u003eThread-safety of \u003ccode\u003eFormat\u003c/code\u003es, including \u003ccode\u003eMessageFormat\u003c/code\u003e and thus\n *     \u003ccode\u003eExtendedMessageFormat\u003c/code\u003e, is not guaranteed.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Matt Benson\n * @author Niall Pemberton\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUMMY_PATTERN"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPED_QUOTE"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FMT"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "END_FE"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FE"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "toPattern"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Create a new ExtendedMessageFormat for the default locale.\n     * \n     * @param pattern  the pattern to use, not null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Locale)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern  the pattern to use, not null\n     * @param locale  the locale to use, not null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Map\u003cjava.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory\u003e)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Create a new ExtendedMessageFormat for the default locale.\n     * \n     * @param pattern  the pattern to use, not null\n     * @param registry  the registry of format factories, may be null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Locale, java.util.Map\u003cjava.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory\u003e)",
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern  the pattern to use, not null\n     * @param locale  the locale to use, not null\n     * @param registry  the registry of format factories, may be null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 29)",
        "(line 126,col 9)-(line 126,col 26)",
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.toPattern()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(java.lang.String)",
      "begin_line": 144,
      "end_line": 209,
      "comment": "\n     * Apply the specified pattern.\n     * \n     * @param pattern String\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 65)",
        "(line 152,col 9)-(line 152,col 70)",
        "(line 153,col 9)-(line 153,col 72)",
        "(line 155,col 9)-(line 155,col 49)",
        "(line 156,col 9)-(line 156,col 41)",
        "(line 157,col 9)-(line 157,col 25)",
        "(line 158,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 51)",
        "(line 195,col 9)-(line 195,col 72)",
        "(line 196,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat(int, java.text.Format)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex(int, java.text.Format)",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats(java.text.Format[])",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex(java.text.Format[])",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.getFormat(java.lang.String)",
      "begin_line": 253,
      "end_line": 268,
      "comment": "\n     * Get a custom format from a format description.\n     * \n     * @param desc String\n     * @return Format\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(java.lang.String, java.text.ParsePosition)",
      "begin_line": 277,
      "end_line": 310,
      "comment": "\n     * Read the argument index from the current format element\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @return argument index\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 35)",
        "(line 279,col 9)-(line 279,col 32)",
        "(line 280,col 9)-(line 280,col 49)",
        "(line 281,col 9)-(line 281,col 30)",
        "(line 282,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 309,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(java.lang.String, java.text.ParsePosition)",
      "begin_line": 319,
      "end_line": 342,
      "comment": "\n     * Parse the format component of a format element.\n     * \n     * @param pattern string to parse\n     * @param pos current parse position\n     * @return Format description String\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 35)",
        "(line 321,col 9)-(line 321,col 32)",
        "(line 322,col 9)-(line 322,col 34)",
        "(line 323,col 9)-(line 323,col 22)",
        "(line 324,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 341,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(java.lang.String, java.util.ArrayList\u003cjava.lang.String\u003e)",
      "begin_line": 351,
      "end_line": 386,
      "comment": "\n     * Insert formats back into the pattern for toPattern() support.\n     *\n     * @param pattern source\n     * @param customPatterns The custom patterns to re-insert, if any\n     * @return full pattern\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 67)",
        "(line 356,col 9)-(line 356,col 49)",
        "(line 357,col 9)-(line 357,col 20)",
        "(line 358,col 9)-(line 358,col 22)",
        "(line 359,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(java.lang.String, java.text.ParsePosition)",
      "begin_line": 394,
      "end_line": 401,
      "comment": "\n     * Consume whitespace from the current parse position.\n     * \n     * @param pattern String to read\n     * @param pos current position\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 20)",
        "(line 396,col 9)-(line 396,col 46)",
        "(line 397,col 9)-(line 400,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.next(java.text.ParsePosition)",
      "begin_line": 409,
      "end_line": 412,
      "comment": "\n     * Convenience method to advance parse position by 1\n     * \n     * @param pos ParsePosition\n     * @return \u003ccode\u003epos\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 41)",
        "(line 411,col 9)-(line 411,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuilder, boolean)",
      "begin_line": 424,
      "end_line": 452,
      "comment": "\n     * Consume a quoted string, adding it to \u003ccode\u003eappendTo\u003c/code\u003e if\n     * specified.\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @param appendTo optional StringBuffer to append\n     * @param escapingOn whether to process escaped quotes\n     * @return \u003ccode\u003eappendTo\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 35)",
        "(line 427,col 9)-(line 427,col 41)",
        "(line 428,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 29)",
        "(line 433,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 451,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.getQuotedString(java.lang.String, java.text.ParsePosition, boolean)",
      "begin_line": 461,
      "end_line": 464,
      "comment": "\n     * Consume quoted string only\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @param escapingOn whether to process escaped quotes\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.containsElements(java.util.Collection\u003c?\u003e)",
      "begin_line": 471,
      "end_line": 481,
      "comment": "\n     * Learn whether the specified Collection contains non-null elements.\n     * @param coll to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if some Object was found, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 21)"
      ]
    }
  ]
}