{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedMessageFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.MessageFormat"
      ],
      "begin_line": 70,
      "end_line": 481,
      "comment": "\n * Extends \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e to allow pluggable/additional formatting\n * options for embedded format elements.  Client code should specify a registry\n * of \u003ccode\u003eFormatFactory\u003c/code\u003e instances associated with \u003ccode\u003eString\u003c/code\u003e\n * format names.  This registry will be consulted when the format elements are \n * parsed from the message pattern.  In this way custom patterns can be specified,\n * and the formats supported by \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e can be overridden\n * at the format and/or format style level (see MessageFormat).  A \"format element\"\n * embedded in the message pattern is specified (\u003cb\u003e()?\u003c/b\u003e signifies optionality):\u003cbr /\u003e\n * \u003ccode\u003e{\u003c/code\u003e\u003ci\u003eargument-number\u003c/i\u003e\u003cb\u003e(\u003c/b\u003e\u003ccode\u003e,\u003c/code\u003e\u003ci\u003eformat-name\u003c/i\u003e\u003cb\u003e(\u003c/b\u003e\u003ccode\u003e,\u003c/code\u003e\u003ci\u003eformat-style\u003c/i\u003e\u003cb\u003e)?)?\u003c/b\u003e\u003ccode\u003e}\u003c/code\u003e\n *\n * \u003cp\u003e\n * \u003ci\u003eformat-name\u003c/i\u003e and \u003ci\u003eformat-style\u003c/i\u003e values are trimmed of surrounding whitespace\n * in the manner of \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e.  If \u003ci\u003eformat-name\u003c/i\u003e denotes\n * \u003ccode\u003eFormatFactory formatFactoryInstance\u003c/code\u003e in \u003ccode\u003eregistry\u003c/code\u003e, a \u003ccode\u003eFormat\u003c/code\u003e\n * matching \u003ci\u003eformat-name\u003c/i\u003e and \u003ci\u003eformat-style\u003c/i\u003e is requested from\n * \u003ccode\u003eformatFactoryInstance\u003c/code\u003e.  If this is successful, the \u003ccode\u003eFormat\u003c/code\u003e\n * found is used for this format element.\n * \u003c/p\u003e\n *\n * \u003cp\u003eNOTICE: The various subformat mutator methods are considered unnecessary; they exist on the parent\n * class to allow the type of customization which it is the job of this class to provide in\n * a configurable fashion.  These methods have thus been disabled and will throw\n * \u003ccode\u003eUnsupportedOperationException\u003c/code\u003e if called.\n * \u003c/p\u003e\n * \n * \u003cp\u003eLimitations inherited from \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e:\n * \u003cul\u003e\n * \u003cli\u003eWhen using \"choice\" subformats, support for nested formatting instructions is limited\n *     to that provided by the base class.\u003c/li\u003e\n * \u003cli\u003eThread-safety of \u003ccode\u003eFormat\u003c/code\u003es, including \u003ccode\u003eMessageFormat\u003c/code\u003e and thus\n *     \u003ccode\u003eExtendedMessageFormat\u003c/code\u003e, is not guaranteed.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Create a new ExtendedMessageFormat for the default locale.\n     * \n     * @param pattern  the pattern to use, not null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Locale)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern  the pattern to use, not null\n     * @param locale  the locale to use, not null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Map\u003cjava.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory\u003e)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Create a new ExtendedMessageFormat for the default locale.\n     * \n     * @param pattern  the pattern to use, not null\n     * @param registry  the registry of format factories, may be null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Locale, java.util.Map\u003cjava.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory\u003e)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern  the pattern to use, not null\n     * @param locale  the locale to use, not null\n     * @param registry  the registry of format factories, may be null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 29)",
        "(line 125,col 9)-(line 125,col 26)",
        "(line 126,col 9)-(line 126,col 33)",
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.toPattern()",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(java.lang.String)",
      "begin_line": 143,
      "end_line": 208,
      "comment": "\n     * Apply the specified pattern.\n     * \n     * @param pattern String\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 65)",
        "(line 151,col 9)-(line 151,col 70)",
        "(line 152,col 9)-(line 152,col 72)",
        "(line 154,col 9)-(line 154,col 49)",
        "(line 155,col 9)-(line 155,col 41)",
        "(line 156,col 9)-(line 156,col 25)",
        "(line 157,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 51)",
        "(line 194,col 9)-(line 194,col 72)",
        "(line 195,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat(int, java.text.Format)",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex(int, java.text.Format)",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats(java.text.Format[])",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex(java.text.Format[])",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\n     * {@inheritDoc}\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.getFormat(java.lang.String)",
      "begin_line": 252,
      "end_line": 267,
      "comment": "\n     * Get a custom format from a format description.\n     * \n     * @param desc String\n     * @return Format\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(java.lang.String, java.text.ParsePosition)",
      "begin_line": 276,
      "end_line": 309,
      "comment": "\n     * Read the argument index from the current format element\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @return argument index\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 35)",
        "(line 278,col 9)-(line 278,col 32)",
        "(line 279,col 9)-(line 279,col 49)",
        "(line 280,col 9)-(line 280,col 30)",
        "(line 281,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 308,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(java.lang.String, java.text.ParsePosition)",
      "begin_line": 318,
      "end_line": 341,
      "comment": "\n     * Parse the format component of a format element.\n     * \n     * @param pattern string to parse\n     * @param pos current parse position\n     * @return Format description String\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 35)",
        "(line 320,col 9)-(line 320,col 32)",
        "(line 321,col 9)-(line 321,col 34)",
        "(line 322,col 9)-(line 322,col 22)",
        "(line 323,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 340,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(java.lang.String, java.util.ArrayList\u003cjava.lang.String\u003e)",
      "begin_line": 350,
      "end_line": 385,
      "comment": "\n     * Insert formats back into the pattern for toPattern() support.\n     *\n     * @param pattern source\n     * @param customPatterns The custom patterns to re-insert, if any\n     * @return full pattern\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 67)",
        "(line 355,col 9)-(line 355,col 49)",
        "(line 356,col 9)-(line 356,col 20)",
        "(line 357,col 9)-(line 357,col 22)",
        "(line 358,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(java.lang.String, java.text.ParsePosition)",
      "begin_line": 393,
      "end_line": 400,
      "comment": "\n     * Consume whitespace from the current parse position.\n     * \n     * @param pattern String to read\n     * @param pos current position\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 20)",
        "(line 395,col 9)-(line 395,col 46)",
        "(line 396,col 9)-(line 399,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.next(java.text.ParsePosition)",
      "begin_line": 408,
      "end_line": 411,
      "comment": "\n     * Convenience method to advance parse position by 1\n     * \n     * @param pos ParsePosition\n     * @return \u003ccode\u003epos\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 41)",
        "(line 410,col 9)-(line 410,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuilder, boolean)",
      "begin_line": 423,
      "end_line": 451,
      "comment": "\n     * Consume a quoted string, adding it to \u003ccode\u003eappendTo\u003c/code\u003e if\n     * specified.\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @param appendTo optional StringBuffer to append\n     * @param escapingOn whether to process escaped quotes\n     * @return \u003ccode\u003eappendTo\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 35)",
        "(line 426,col 9)-(line 426,col 41)",
        "(line 427,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 29)",
        "(line 432,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 450,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.getQuotedString(java.lang.String, java.text.ParsePosition, boolean)",
      "begin_line": 460,
      "end_line": 463,
      "comment": "\n     * Consume quoted string only\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @param escapingOn whether to process escaped quotes\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.containsElements(java.util.Collection\u003c?\u003e)",
      "begin_line": 470,
      "end_line": 480,
      "comment": "\n     * Learn whether the specified Collection contains non-null elements.\n     * @param coll to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if some Object was found, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 21)"
      ]
    }
  ]
}