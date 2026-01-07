{
  "filepath": "/tmp/Lang-23b/src/main/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedMessageFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.MessageFormat"
      ],
      "begin_line": 71,
      "end_line": 505,
      "comment": "\n * Extends \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e to allow pluggable/additional formatting\n * options for embedded format elements.  Client code should specify a registry\n * of \u003ccode\u003eFormatFactory\u003c/code\u003e instances associated with \u003ccode\u003eString\u003c/code\u003e\n * format names.  This registry will be consulted when the format elements are \n * parsed from the message pattern.  In this way custom patterns can be specified,\n * and the formats supported by \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e can be overridden\n * at the format and/or format style level (see MessageFormat).  A \"format element\"\n * embedded in the message pattern is specified (\u003cb\u003e()?\u003c/b\u003e signifies optionality):\u003cbr /\u003e\n * \u003ccode\u003e{\u003c/code\u003e\u003ci\u003eargument-number\u003c/i\u003e\u003cb\u003e(\u003c/b\u003e\u003ccode\u003e,\u003c/code\u003e\u003ci\u003eformat-name\u003c/i\u003e\u003cb\u003e(\u003c/b\u003e\u003ccode\u003e,\u003c/code\u003e\u003ci\u003eformat-style\u003c/i\u003e\u003cb\u003e)?)?\u003c/b\u003e\u003ccode\u003e}\u003c/code\u003e\n *\n * \u003cp\u003e\n * \u003ci\u003eformat-name\u003c/i\u003e and \u003ci\u003eformat-style\u003c/i\u003e values are trimmed of surrounding whitespace\n * in the manner of \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e.  If \u003ci\u003eformat-name\u003c/i\u003e denotes\n * \u003ccode\u003eFormatFactory formatFactoryInstance\u003c/code\u003e in \u003ccode\u003eregistry\u003c/code\u003e, a \u003ccode\u003eFormat\u003c/code\u003e\n * matching \u003ci\u003eformat-name\u003c/i\u003e and \u003ci\u003eformat-style\u003c/i\u003e is requested from\n * \u003ccode\u003eformatFactoryInstance\u003c/code\u003e.  If this is successful, the \u003ccode\u003eFormat\u003c/code\u003e\n * found is used for this format element.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\u003cb\u003eNOTICE:\u003c/b\u003e The various subformat mutator methods are considered unnecessary; they exist on the parent\n * class to allow the type of customization which it is the job of this class to provide in\n * a configurable fashion.  These methods have thus been disabled and will throw\n * \u003ccode\u003eUnsupportedOperationException\u003c/code\u003e if called.\n * \u003c/p\u003e\n * \n * \u003cp\u003eLimitations inherited from \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e:\n * \u003cul\u003e\n * \u003cli\u003eWhen using \"choice\" subformats, support for nested formatting instructions is limited\n *     to that provided by the base class.\u003c/li\u003e\n * \u003cli\u003eThread-safety of \u003ccode\u003eFormat\u003c/code\u003es, including \u003ccode\u003eMessageFormat\u003c/code\u003e and thus\n *     \u003ccode\u003eExtendedMessageFormat\u003c/code\u003e, is not guaranteed.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
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
      "begin_line": 218,
      "end_line": 221,
      "comment": "\n     * Throws UnsupportedOperationException - see class Javadoc for details.\n     * \n     * @param formatElementIndex format element index\n     * @param newFormat the new format\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex(int, java.text.Format)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "\n     * Throws UnsupportedOperationException - see class Javadoc for details.\n     * \n     * @param argumentIndex argument index\n     * @param newFormat the new format\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats(java.text.Format[])",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\n     * Throws UnsupportedOperationException - see class Javadoc for details.\n     * \n     * @param newFormats new formats\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex(java.text.Format[])",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\n     * Throws UnsupportedOperationException - see class Javadoc for details.\n     * \n     * @param newFormats new formats\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.getFormat(java.lang.String)",
      "begin_line": 276,
      "end_line": 291,
      "comment": "\n     * Get a custom format from a format description.\n     * \n     * @param desc String\n     * @return Format\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(java.lang.String, java.text.ParsePosition)",
      "begin_line": 300,
      "end_line": 333,
      "comment": "\n     * Read the argument index from the current format element\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @return argument index\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 35)",
        "(line 302,col 9)-(line 302,col 32)",
        "(line 303,col 9)-(line 303,col 49)",
        "(line 304,col 9)-(line 304,col 30)",
        "(line 305,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 332,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(java.lang.String, java.text.ParsePosition)",
      "begin_line": 342,
      "end_line": 365,
      "comment": "\n     * Parse the format component of a format element.\n     * \n     * @param pattern string to parse\n     * @param pos current parse position\n     * @return Format description String\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 35)",
        "(line 344,col 9)-(line 344,col 32)",
        "(line 345,col 9)-(line 345,col 34)",
        "(line 346,col 9)-(line 346,col 22)",
        "(line 347,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 364,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(java.lang.String, java.util.ArrayList\u003cjava.lang.String\u003e)",
      "begin_line": 374,
      "end_line": 409,
      "comment": "\n     * Insert formats back into the pattern for toPattern() support.\n     *\n     * @param pattern source\n     * @param customPatterns The custom patterns to re-insert, if any\n     * @return full pattern\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 67)",
        "(line 379,col 9)-(line 379,col 49)",
        "(line 380,col 9)-(line 380,col 20)",
        "(line 381,col 9)-(line 381,col 22)",
        "(line 382,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(java.lang.String, java.text.ParsePosition)",
      "begin_line": 417,
      "end_line": 424,
      "comment": "\n     * Consume whitespace from the current parse position.\n     * \n     * @param pattern String to read\n     * @param pos current position\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 20)",
        "(line 419,col 9)-(line 419,col 46)",
        "(line 420,col 9)-(line 423,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.next(java.text.ParsePosition)",
      "begin_line": 432,
      "end_line": 435,
      "comment": "\n     * Convenience method to advance parse position by 1\n     * \n     * @param pos ParsePosition\n     * @return \u003ccode\u003epos\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 41)",
        "(line 434,col 9)-(line 434,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuilder, boolean)",
      "begin_line": 447,
      "end_line": 475,
      "comment": "\n     * Consume a quoted string, adding it to \u003ccode\u003eappendTo\u003c/code\u003e if\n     * specified.\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @param appendTo optional StringBuffer to append\n     * @param escapingOn whether to process escaped quotes\n     * @return \u003ccode\u003eappendTo\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 35)",
        "(line 450,col 9)-(line 450,col 41)",
        "(line 451,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 29)",
        "(line 456,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 474,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.getQuotedString(java.lang.String, java.text.ParsePosition, boolean)",
      "begin_line": 484,
      "end_line": 487,
      "comment": "\n     * Consume quoted string only\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @param escapingOn whether to process escaped quotes\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.containsElements(java.util.Collection\u003c?\u003e)",
      "begin_line": 494,
      "end_line": 504,
      "comment": "\n     * Learn whether the specified Collection contains non-null elements.\n     * @param coll to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if some Object was found, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 21)"
      ]
    }
  ]
}