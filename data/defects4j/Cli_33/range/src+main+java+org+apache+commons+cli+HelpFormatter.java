{
  "filepath": "/tmp/Cli-33b/src/main/java/org/apache/commons/cli/HelpFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HelpFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 1025,
      "comment": " \n * A formatter of help messages for the current command line options\n *\n * @author Slawek Zachcial\n * @author John Keyes (john at integralsource.com)\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WIDTH"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " default number of characters per line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEFT_PAD"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " default padding to the left of each line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DESC_PAD"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * the number of characters of padding to be prefixed\n     * to each description line\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SYNTAX_PREFIX"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " the string to display at the beginning of the usage statement "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OPT_PREFIX"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " default prefix for shortOpts "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_PREFIX"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " default prefix for long Option "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_SEPARATOR"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " default separator displayed between a long Option and its value "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARG_NAME"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " default name for an argument "
    },
    {
      "type": "field",
      "varNames": [
        "defaultWidth"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * number of characters per line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setWidth methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLeftPad"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * amount of padding to the left of each line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setLeftPadding methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultDescPad"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setDescPadding methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultSyntaxPrefix"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * the string to display at the begining of the usage statement\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setSyntaxPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultNewLine"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * the new line string\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setNewLine methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultOptPrefix"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * the shortOpt prefix\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setOptPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLongOptPrefix"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * the long Opt prefix\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setLongOptPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "longOptSeparator"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The separator displayed between the long option and its value. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultArgName"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * the name of the argument\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setArgName methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optionComparator"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * Comparator used to sort the options when they output in help text\n     * \n     * Defaults to case-insensitive alphabetical sorting by option key\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setWidth(int)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "\n     * Sets the \u0027width\u0027.\n     *\n     * @param width the new value of \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getWidth()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\n     * Returns the \u0027width\u0027.\n     *\n     * @return the \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLeftPadding(int)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Sets the \u0027leftPadding\u0027.\n     *\n     * @param padding the new value of \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLeftPadding()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Returns the \u0027leftPadding\u0027.\n     *\n     * @return the \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setDescPadding(int)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Sets the \u0027descPadding\u0027.\n     *\n     * @param padding the new value of \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getDescPadding()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Returns the \u0027descPadding\u0027.\n     *\n     * @return the \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setSyntaxPrefix(java.lang.String)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * Sets the \u0027syntaxPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getSyntaxPrefix()",
      "begin_line": 222,
      "end_line": 225,
      "comment": "\n     * Returns the \u0027syntaxPrefix\u0027.\n     *\n     * @return the \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setNewLine(java.lang.String)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * Sets the \u0027newLine\u0027.\n     *\n     * @param newline the new value of \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getNewLine()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * Returns the \u0027newLine\u0027.\n     *\n     * @return the \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptPrefix(java.lang.String)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\n     * Sets the \u0027optPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptPrefix()",
      "begin_line": 262,
      "end_line": 265,
      "comment": "\n     * Returns the \u0027optPrefix\u0027.\n     *\n     * @return the \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptPrefix(java.lang.String)",
      "begin_line": 272,
      "end_line": 275,
      "comment": "\n     * Sets the \u0027longOptPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptPrefix()",
      "begin_line": 282,
      "end_line": 285,
      "comment": "\n     * Returns the \u0027longOptPrefix\u0027.\n     *\n     * @return the \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptSeparator(java.lang.String)",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\n     * Set the separator displayed between a long option and its value.\n     * Ensure that the separator specified is supported by the parser used,\n     * typically \u0027 \u0027 or \u0027\u003d\u0027.\n     * \n     * @param longOptSeparator the separator, typically \u0027 \u0027 or \u0027\u003d\u0027.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptSeparator()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * Returns the separator displayed between a long option and its value.\n     * \n     * @return the separator\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setArgName(java.lang.String)",
      "begin_line": 316,
      "end_line": 319,
      "comment": "\n     * Sets the \u0027argName\u0027.\n     *\n     * @param name the new value of \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getArgName()",
      "begin_line": 326,
      "end_line": 329,
      "comment": "\n     * Returns the \u0027argName\u0027.\n     *\n     * @return the \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptionComparator()",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\n     * Comparator used to sort the options when they output in help text.\n     * Defaults to case-insensitive alphabetical sorting by option key.\n     * \n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptionComparator(java.util.Comparator)",
      "begin_line": 348,
      "end_line": 358,
      "comment": "\n     * Set the comparator used to sort the options when they output in help text.\n     * Passing in a null parameter will set the ordering to the default mode.\n     * \n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 368,
      "end_line": 371,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options, boolean)",
      "begin_line": 383,
      "end_line": 386,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 398,
      "end_line": 401,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 415,
      "end_line": 418,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 431,
      "end_line": 434,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 449,
      "end_line": 456,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 53)",
        "(line 454,col 9)-(line 454,col 112)",
        "(line 455,col 9)-(line 455,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)",
      "begin_line": 475,
      "end_line": 480,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     *\n     * @throws IllegalStateException if there is no room to print a line\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String, boolean)",
      "begin_line": 502,
      "end_line": 531,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     *\n     * @throws IllegalStateException if there is no room to print a line\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 509,col 9)",
        "(line 511,col 9)-(line 518,col 9)",
        "(line 520,col 9)-(line 523,col 9)",
        "(line 525,col 9)-(line 525,col 59)",
        "(line 527,col 9)-(line 530,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 541,
      "end_line": 596,
      "comment": "\n     * Prints the usage statement for the specified application.\n     *\n     * @param pw The PrintWriter to print the usage statement \n     * @param width The number of characters to display per line\n     * @param app The application name\n     * @param options The command line Options\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 90)",
        "(line 547,col 9)-(line 547,col 59)",
        "(line 550,col 9)-(line 550,col 22)",
        "(line 552,col 9)-(line 552,col 59)",
        "(line 553,col 9)-(line 553,col 57)",
        "(line 555,col 9)-(line 591,col 9)",
        "(line 595,col 9)-(line 595,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)",
      "begin_line": 606,
      "end_line": 631,
      "comment": "\n     * Appends the usage clause for an OptionGroup to a StringBuffer.  \n     * The clause is wrapped in square brackets if the group is required.\n     * The display of the options is handled by appendOption\n     * @param buff the StringBuffer to append to\n     * @param group the group to append\n     * @see #appendOption(StringBuffer,Option,boolean)\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 611,col 9)",
        "(line 613,col 9)-(line 613,col 57)",
        "(line 614,col 9)-(line 614,col 57)",
        "(line 616,col 9)-(line 625,col 9)",
        "(line 627,col 9)-(line 630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)",
      "begin_line": 640,
      "end_line": 668,
      "comment": "\n     * Appends the usage clause for an Option to a StringBuffer.  \n     *\n     * @param buff the StringBuffer to append to\n     * @param option the Option to append\n     * @param required whether the Option is required or not\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 645,col 9)",
        "(line 647,col 9)-(line 654,col 9)",
        "(line 657,col 9)-(line 661,col 9)",
        "(line 664,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 678,
      "end_line": 683,
      "comment": "\n     * Print the cmdLineSyntax to the specified writer, using the\n     * specified width.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters per line for the usage statement.\n     * @param cmdLineSyntax The usage statement.\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 52)",
        "(line 682,col 9)-(line 682,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printOptions(java.io.PrintWriter, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 697,
      "end_line": 704,
      "comment": "\n     * Print the help for the specified Options to the specified writer, \n     * using the specified width, left padding and description padding.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 45)",
        "(line 702,col 9)-(line 702,col 60)",
        "(line 703,col 9)-(line 703,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 713,
      "end_line": 716,
      "comment": "\n     * Print the specified text to the specified PrintWriter.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, int, java.lang.String)",
      "begin_line": 726,
      "end_line": 732,
      "comment": "\n     * Print the specified text to the specified PrintWriter.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 58)",
        "(line 730,col 9)-(line 730,col 60)",
        "(line 731,col 9)-(line 731,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderOptions(java.lang.StringBuffer, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 750,
      "end_line": 835,
      "comment": "\n     * Render the specified Options and return the rendered Options\n     * in a StringBuffer.\n     *\n     * @param sb The StringBuffer to place the rendered Options into.\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 51)",
        "(line 753,col 9)-(line 753,col 51)",
        "(line 759,col 9)-(line 759,col 20)",
        "(line 760,col 9)-(line 760,col 28)",
        "(line 761,col 9)-(line 761,col 42)",
        "(line 763,col 9)-(line 763,col 45)",
        "(line 765,col 9)-(line 765,col 57)",
        "(line 767,col 9)-(line 803,col 9)",
        "(line 805,col 9)-(line 805,col 18)",
        "(line 807,col 9)-(line 832,col 9)",
        "(line 834,col 9)-(line 834,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderWrappedText(java.lang.StringBuffer, int, int, java.lang.String)",
      "begin_line": 848,
      "end_line": 889,
      "comment": "\n     * Render the specified text and return the rendered Options\n     * in a StringBuffer.\n     *\n     * @param sb The StringBuffer to place the rendered text into.\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be rendered.\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 46)",
        "(line 853,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 72)",
        "(line 861,col 9)-(line 865,col 9)",
        "(line 868,col 9)-(line 868,col 62)",
        "(line 870,col 9)-(line 888,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.findWrapPos(java.lang.String, int, int)",
      "begin_line": 917,
      "end_line": 954,
      "comment": "\n     * Finds the next text wrap position after \u003ccode\u003estartPos\u003c/code\u003e for the\n     * text in \u003ccode\u003etext\u003c/code\u003e with the column width \u003ccode\u003ewidth\u003c/code\u003e.\n     * The wrap point is the last position before startPos+width having a \n     * whitespace character (space, \\n, \\r). If there is no whitespace character\n     * before startPos+width, it will return startPos+width.\n     *\n     * @param text The text being searched for the wrap position\n     * @param width width of the wrapped text\n     * @param startPos position from which to start the lookup whitespace\n     * character\n     * @return postion on which the text must be wrapped or -1 if the wrap\n     * position is at the end of the text\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 16)",
        "(line 922,col 9)-(line 930,col 9)",
        "(line 934,col 9)-(line 934,col 31)",
        "(line 936,col 9)-(line 936,col 15)",
        "(line 938,col 9)-(line 942,col 9)",
        "(line 945,col 9)-(line 948,col 9)",
        "(line 951,col 9)-(line 951,col 31)",
        "(line 953,col 9)-(line 953,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.createPadding(int)",
      "begin_line": 963,
      "end_line": 969,
      "comment": "\n     * Return a String of padding of length \u003ccode\u003elen\u003c/code\u003e.\n     *\n     * @param len The length of the String of padding to create.\n     *\n     * @return The String of padding\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 39)",
        "(line 966,col 9)-(line 966,col 34)",
        "(line 968,col 9)-(line 968,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.rtrim(java.lang.String)",
      "begin_line": 978,
      "end_line": 993,
      "comment": "\n     * Remove the trailing whitespace from the specified String.\n     *\n     * @param s The String to remove the trailing padding from.\n     *\n     * @return The String of without the trailing padding\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 983,col 9)",
        "(line 985,col 9)-(line 985,col 29)",
        "(line 987,col 9)-(line 990,col 9)",
        "(line 992,col 9)-(line 992,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OptionComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 1002,
      "end_line": 1023,
      "comment": "\n     * This class implements the \u003ccode\u003eComparator\u003c/code\u003e interface\n     * for comparing Options.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.OptionComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 1016,
      "end_line": 1022,
      "comment": "\n         * Compares its two arguments for order. Returns a negative\n         * integer, zero, or a positive integer as the first argument\n         * is less than, equal to, or greater than the second.\n         *\n         * @param o1 The first Option to be compared.\n         * @param o2 The second Option to be compared.\n         * @return a negative integer, zero, or a positive integer as\n         *         the first argument is less than, equal to, or greater than the\n         *         second.\n         ",
      "child_ranges": [
        "(line 1018,col 13)-(line 1018,col 38)",
        "(line 1019,col 13)-(line 1019,col 38)",
        "(line 1021,col 13)-(line 1021,col 68)"
      ]
    }
  ]
}