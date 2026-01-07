{
  "filepath": "/tmp/Cli-27b/src/java/org/apache/commons/cli/HelpFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HelpFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 990,
      "comment": " \n * A formatter of help messages for the current command line options\n *\n * @author Slawek Zachcial\n * @author John Keyes (john at integralsource.com)\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WIDTH"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " default number of characters per line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEFT_PAD"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " default padding to the left of each line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DESC_PAD"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * the number of characters of padding to be prefixed\n     * to each description line\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SYNTAX_PREFIX"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " the string to display at the beginning of the usage statement "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OPT_PREFIX"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " default prefix for shortOpts "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_PREFIX"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " default prefix for long Option "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARG_NAME"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " default name for an argument "
    },
    {
      "type": "field",
      "varNames": [
        "defaultWidth"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * number of characters per line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setWidth methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLeftPad"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * amount of padding to the left of each line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setLeftPadding methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultDescPad"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setDescPadding methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultSyntaxPrefix"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * the string to display at the begining of the usage statement\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setSyntaxPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultNewLine"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * the new line string\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setNewLine methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultOptPrefix"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * the shortOpt prefix\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setOptPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLongOptPrefix"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * the long Opt prefix\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setLongOptPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultArgName"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * the name of the argument\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setArgName methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optionComparator"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Comparator used to sort the options when they output in help text\n     * \n     * Defaults to case-insensitive alphabetical sorting by option key\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setWidth(int)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * Sets the \u0027width\u0027.\n     *\n     * @param width the new value of \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getWidth()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "\n     * Returns the \u0027width\u0027.\n     *\n     * @return the \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLeftPadding(int)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * Sets the \u0027leftPadding\u0027.\n     *\n     * @param padding the new value of \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLeftPadding()",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\n     * Returns the \u0027leftPadding\u0027.\n     *\n     * @return the \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setDescPadding(int)",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\n     * Sets the \u0027descPadding\u0027.\n     *\n     * @param padding the new value of \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getDescPadding()",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n     * Returns the \u0027descPadding\u0027.\n     *\n     * @return the \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setSyntaxPrefix(java.lang.String)",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * Sets the \u0027syntaxPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getSyntaxPrefix()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Returns the \u0027syntaxPrefix\u0027.\n     *\n     * @return the \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setNewLine(java.lang.String)",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * Sets the \u0027newLine\u0027.\n     *\n     * @param newline the new value of \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getNewLine()",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n     * Returns the \u0027newLine\u0027.\n     *\n     * @return the \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptPrefix(java.lang.String)",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\n     * Sets the \u0027optPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptPrefix()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * Returns the \u0027optPrefix\u0027.\n     *\n     * @return the \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptPrefix(java.lang.String)",
      "begin_line": 265,
      "end_line": 268,
      "comment": "\n     * Sets the \u0027longOptPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptPrefix()",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Returns the \u0027longOptPrefix\u0027.\n     *\n     * @return the \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setArgName(java.lang.String)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n     * Sets the \u0027argName\u0027.\n     *\n     * @param name the new value of \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getArgName()",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\n     * Returns the \u0027argName\u0027.\n     *\n     * @return the \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptionComparator()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * Comparator used to sort the options when they output in help text.\n     * Defaults to case-insensitive alphabetical sorting by option key.\n     * \n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptionComparator(java.util.Comparator)",
      "begin_line": 317,
      "end_line": 327,
      "comment": "\n     * Set the comparator used to sort the options when they output in help text.\n     * Passing in a null parameter will set the ordering to the default mode.\n     * \n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options, boolean)",
      "begin_line": 352,
      "end_line": 355,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 367,
      "end_line": 370,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 418,
      "end_line": 425,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 53)",
        "(line 423,col 9)-(line 423,col 112)",
        "(line 424,col 9)-(line 424,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)",
      "begin_line": 444,
      "end_line": 449,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     *\n     * @throws IllegalStateException if there is no room to print a line\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String, boolean)",
      "begin_line": 471,
      "end_line": 500,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     *\n     * @throws IllegalStateException if there is no room to print a line\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 59)",
        "(line 496,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 511,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003ePrints the usage statement for the specified application.\u003c/p\u003e\n     *\n     * @param pw The PrintWriter to print the usage statement \n     * @param width The number of characters to display per line\n     * @param app The application name\n     * @param options The command line Options\n     *\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 90)",
        "(line 517,col 9)-(line 517,col 59)",
        "(line 520,col 9)-(line 520,col 22)",
        "(line 522,col 9)-(line 522,col 59)",
        "(line 523,col 9)-(line 523,col 57)",
        "(line 525,col 9)-(line 561,col 9)",
        "(line 565,col 9)-(line 565,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)",
      "begin_line": 576,
      "end_line": 601,
      "comment": "\n     * Appends the usage clause for an OptionGroup to a StringBuffer.  \n     * The clause is wrapped in square brackets if the group is required.\n     * The display of the options is handled by appendOption\n     * @param buff the StringBuffer to append to\n     * @param group the group to append\n     * @see #appendOption(StringBuffer,Option,boolean)\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 581,col 9)",
        "(line 583,col 9)-(line 583,col 57)",
        "(line 584,col 9)-(line 584,col 57)",
        "(line 586,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 600,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)",
      "begin_line": 610,
      "end_line": 637,
      "comment": "\n     * Appends the usage clause for an Option to a StringBuffer.  \n     *\n     * @param buff the StringBuffer to append to\n     * @param option the Option to append\n     * @param required whether the Option is required or not\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 615,col 9)",
        "(line 617,col 9)-(line 624,col 9)",
        "(line 627,col 9)-(line 630,col 9)",
        "(line 633,col 9)-(line 636,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 647,
      "end_line": 652,
      "comment": "\n     * Print the cmdLineSyntax to the specified writer, using the\n     * specified width.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters per line for the usage statement.\n     * @param cmdLineSyntax The usage statement.\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 52)",
        "(line 651,col 9)-(line 651,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printOptions(java.io.PrintWriter, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 666,
      "end_line": 673,
      "comment": "\n     * \u003cp\u003ePrint the help for the specified Options to the specified writer, \n     * using the specified width, left padding and description padding.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 45)",
        "(line 671,col 9)-(line 671,col 60)",
        "(line 672,col 9)-(line 672,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 682,
      "end_line": 685,
      "comment": "\n     * Print the specified text to the specified PrintWriter.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, int, java.lang.String)",
      "begin_line": 695,
      "end_line": 701,
      "comment": "\n     * Print the specified text to the specified PrintWriter.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 58)",
        "(line 699,col 9)-(line 699,col 60)",
        "(line 700,col 9)-(line 700,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderOptions(java.lang.StringBuffer, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 719,
      "end_line": 801,
      "comment": "\n     * Render the specified Options and return the rendered Options\n     * in a StringBuffer.\n     *\n     * @param sb The StringBuffer to place the rendered Options into.\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 51)",
        "(line 722,col 9)-(line 722,col 51)",
        "(line 728,col 9)-(line 728,col 20)",
        "(line 729,col 9)-(line 729,col 28)",
        "(line 730,col 9)-(line 730,col 42)",
        "(line 732,col 9)-(line 732,col 45)",
        "(line 734,col 9)-(line 734,col 57)",
        "(line 736,col 9)-(line 769,col 9)",
        "(line 771,col 9)-(line 771,col 18)",
        "(line 773,col 9)-(line 798,col 9)",
        "(line 800,col 9)-(line 800,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderWrappedText(java.lang.StringBuffer, int, int, java.lang.String)",
      "begin_line": 814,
      "end_line": 856,
      "comment": "\n     * Render the specified text and return the rendered Options\n     * in a StringBuffer.\n     *\n     * @param sb The StringBuffer to place the rendered text into.\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be rendered.\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 46)",
        "(line 819,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 72)",
        "(line 827,col 9)-(line 831,col 9)",
        "(line 835,col 9)-(line 835,col 62)",
        "(line 837,col 9)-(line 855,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.findWrapPos(java.lang.String, int, int)",
      "begin_line": 871,
      "end_line": 915,
      "comment": "\n     * Finds the next text wrap position after \u003ccode\u003estartPos\u003c/code\u003e for the\n     * text in \u003ccode\u003etext\u003c/code\u003e with the column width \u003ccode\u003ewidth\u003c/code\u003e.\n     * The wrap point is the last postion before startPos+width having a \n     * whitespace character (space, \\n, \\r).\n     *\n     * @param text The text being searched for the wrap position\n     * @param width width of the wrapped text\n     * @param startPos position from which to start the lookup whitespace\n     * character\n     * @return postion on which the text must be wrapped or -1 if the wrap\n     * position is at the end of the text\n     ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 21)",
        "(line 876,col 9)-(line 884,col 9)",
        "(line 888,col 9)-(line 888,col 31)",
        "(line 890,col 9)-(line 890,col 15)",
        "(line 892,col 9)-(line 896,col 9)",
        "(line 899,col 9)-(line 902,col 9)",
        "(line 906,col 9)-(line 906,col 31)",
        "(line 908,col 9)-(line 912,col 9)",
        "(line 914,col 9)-(line 914,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.createPadding(int)",
      "begin_line": 924,
      "end_line": 934,
      "comment": "\n     * Return a String of padding of length \u003ccode\u003elen\u003c/code\u003e.\n     *\n     * @param len The length of the String of padding to create.\n     *\n     * @return The String of padding\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 48)",
        "(line 928,col 9)-(line 931,col 9)",
        "(line 933,col 9)-(line 933,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.rtrim(java.lang.String)",
      "begin_line": 943,
      "end_line": 958,
      "comment": "\n     * Remove the trailing whitespace from the specified String.\n     *\n     * @param s The String to remove the trailing padding from.\n     *\n     * @return The String of without the trailing padding\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 948,col 9)",
        "(line 950,col 9)-(line 950,col 29)",
        "(line 952,col 9)-(line 955,col 9)",
        "(line 957,col 9)-(line 957,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OptionComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 967,
      "end_line": 988,
      "comment": "\n     * This class implements the \u003ccode\u003eComparator\u003c/code\u003e interface\n     * for comparing Options.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.OptionComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 981,
      "end_line": 987,
      "comment": "\n         * Compares its two arguments for order. Returns a negative\n         * integer, zero, or a positive integer as the first argument\n         * is less than, equal to, or greater than the second.\n         *\n         * @param o1 The first Option to be compared.\n         * @param o2 The second Option to be compared.\n         * @return a negative integer, zero, or a positive integer as\n         *         the first argument is less than, equal to, or greater than the\n         *         second.\n         ",
      "child_ranges": [
        "(line 983,col 13)-(line 983,col 38)",
        "(line 984,col 13)-(line 984,col 38)",
        "(line 986,col 13)-(line 986,col 68)"
      ]
    }
  ]
}