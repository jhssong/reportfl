{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/HelpFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HelpFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 1018,
      "comment": " \n * A formatter of help messages for the current command line options\n *\n * @author Slawek Zachcial\n * @author John Keyes (john at integralsource.com)\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WIDTH"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " default number of characters per line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEFT_PAD"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " default padding to the left of each line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DESC_PAD"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * the number of characters of padding to be prefixed\n     * to each description line\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SYNTAX_PREFIX"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " the string to display at the beginning of the usage statement "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OPT_PREFIX"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " default prefix for shortOpts "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_PREFIX"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " default prefix for long Option "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_SEPARATOR"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " default separator displayed between a long Option and its value "
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
        "longOptSeparator"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The separator displayed between the long option and its value. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultArgName"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * the name of the argument\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setArgName methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optionComparator"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Comparator used to sort the options when they output in help text\n     * \n     * Defaults to case-insensitive alphabetical sorting by option key\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setWidth(int)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Sets the \u0027width\u0027.\n     *\n     * @param width the new value of \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getWidth()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n     * Returns the \u0027width\u0027.\n     *\n     * @return the \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLeftPadding(int)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * Sets the \u0027leftPadding\u0027.\n     *\n     * @param padding the new value of \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLeftPadding()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * Returns the \u0027leftPadding\u0027.\n     *\n     * @return the \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setDescPadding(int)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Sets the \u0027descPadding\u0027.\n     *\n     * @param padding the new value of \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getDescPadding()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Returns the \u0027descPadding\u0027.\n     *\n     * @return the \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setSyntaxPrefix(java.lang.String)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * Sets the \u0027syntaxPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getSyntaxPrefix()",
      "begin_line": 218,
      "end_line": 221,
      "comment": "\n     * Returns the \u0027syntaxPrefix\u0027.\n     *\n     * @return the \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setNewLine(java.lang.String)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * Sets the \u0027newLine\u0027.\n     *\n     * @param newline the new value of \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getNewLine()",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * Returns the \u0027newLine\u0027.\n     *\n     * @return the \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptPrefix(java.lang.String)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n     * Sets the \u0027optPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptPrefix()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * Returns the \u0027optPrefix\u0027.\n     *\n     * @return the \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptPrefix(java.lang.String)",
      "begin_line": 268,
      "end_line": 271,
      "comment": "\n     * Sets the \u0027longOptPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptPrefix()",
      "begin_line": 278,
      "end_line": 281,
      "comment": "\n     * Returns the \u0027longOptPrefix\u0027.\n     *\n     * @return the \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptSeparator(java.lang.String)",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n     * Set the separator displayed between a long option and its value.\n     * Ensure that the separator specified is supported by the parser used,\n     * typically \u0027 \u0027 or \u0027\u003d\u0027.\n     * \n     * @param longOptSeparator the separator, typically \u0027 \u0027 or \u0027\u003d\u0027.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptSeparator()",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * Returns the separator displayed between a long option and its value.\n     * \n     * @return the separator\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setArgName(java.lang.String)",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * Sets the \u0027argName\u0027.\n     *\n     * @param name the new value of \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getArgName()",
      "begin_line": 322,
      "end_line": 325,
      "comment": "\n     * Returns the \u0027argName\u0027.\n     *\n     * @return the \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptionComparator()",
      "begin_line": 333,
      "end_line": 336,
      "comment": "\n     * Comparator used to sort the options when they output in help text.\n     * Defaults to case-insensitive alphabetical sorting by option key.\n     * \n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptionComparator(java.util.Comparator)",
      "begin_line": 344,
      "end_line": 354,
      "comment": "\n     * Set the comparator used to sort the options when they output in help text.\n     * Passing in a null parameter will set the ordering to the default mode.\n     * \n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options, boolean)",
      "begin_line": 379,
      "end_line": 382,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 394,
      "end_line": 397,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 411,
      "end_line": 414,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 427,
      "end_line": 430,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 445,
      "end_line": 452,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 53)",
        "(line 450,col 9)-(line 450,col 112)",
        "(line 451,col 9)-(line 451,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)",
      "begin_line": 471,
      "end_line": 476,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     *\n     * @throws IllegalStateException if there is no room to print a line\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String, boolean)",
      "begin_line": 498,
      "end_line": 527,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     *\n     * @throws IllegalStateException if there is no room to print a line\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 505,col 9)",
        "(line 507,col 9)-(line 514,col 9)",
        "(line 516,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 521,col 59)",
        "(line 523,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 537,
      "end_line": 592,
      "comment": "\n     * Prints the usage statement for the specified application.\n     *\n     * @param pw The PrintWriter to print the usage statement \n     * @param width The number of characters to display per line\n     * @param app The application name\n     * @param options The command line Options\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 90)",
        "(line 543,col 9)-(line 543,col 59)",
        "(line 546,col 9)-(line 546,col 22)",
        "(line 548,col 9)-(line 548,col 59)",
        "(line 549,col 9)-(line 549,col 57)",
        "(line 551,col 9)-(line 587,col 9)",
        "(line 591,col 9)-(line 591,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)",
      "begin_line": 602,
      "end_line": 627,
      "comment": "\n     * Appends the usage clause for an OptionGroup to a StringBuffer.  \n     * The clause is wrapped in square brackets if the group is required.\n     * The display of the options is handled by appendOption\n     * @param buff the StringBuffer to append to\n     * @param group the group to append\n     * @see #appendOption(StringBuffer,Option,boolean)\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 607,col 9)",
        "(line 609,col 9)-(line 609,col 57)",
        "(line 610,col 9)-(line 610,col 57)",
        "(line 612,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 626,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)",
      "begin_line": 636,
      "end_line": 664,
      "comment": "\n     * Appends the usage clause for an Option to a StringBuffer.  \n     *\n     * @param buff the StringBuffer to append to\n     * @param option the Option to append\n     * @param required whether the Option is required or not\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 641,col 9)",
        "(line 643,col 9)-(line 650,col 9)",
        "(line 653,col 9)-(line 657,col 9)",
        "(line 660,col 9)-(line 663,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 674,
      "end_line": 679,
      "comment": "\n     * Print the cmdLineSyntax to the specified writer, using the\n     * specified width.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters per line for the usage statement.\n     * @param cmdLineSyntax The usage statement.\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 52)",
        "(line 678,col 9)-(line 678,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printOptions(java.io.PrintWriter, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 693,
      "end_line": 700,
      "comment": "\n     * Print the help for the specified Options to the specified writer, \n     * using the specified width, left padding and description padding.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 45)",
        "(line 698,col 9)-(line 698,col 60)",
        "(line 699,col 9)-(line 699,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 709,
      "end_line": 712,
      "comment": "\n     * Print the specified text to the specified PrintWriter.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, int, java.lang.String)",
      "begin_line": 722,
      "end_line": 728,
      "comment": "\n     * Print the specified text to the specified PrintWriter.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 58)",
        "(line 726,col 9)-(line 726,col 60)",
        "(line 727,col 9)-(line 727,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderOptions(java.lang.StringBuffer, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 746,
      "end_line": 829,
      "comment": "\n     * Render the specified Options and return the rendered Options\n     * in a StringBuffer.\n     *\n     * @param sb The StringBuffer to place the rendered Options into.\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 51)",
        "(line 749,col 9)-(line 749,col 51)",
        "(line 755,col 9)-(line 755,col 20)",
        "(line 756,col 9)-(line 756,col 28)",
        "(line 757,col 9)-(line 757,col 42)",
        "(line 759,col 9)-(line 759,col 45)",
        "(line 761,col 9)-(line 761,col 57)",
        "(line 763,col 9)-(line 797,col 9)",
        "(line 799,col 9)-(line 799,col 18)",
        "(line 801,col 9)-(line 826,col 9)",
        "(line 828,col 9)-(line 828,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderWrappedText(java.lang.StringBuffer, int, int, java.lang.String)",
      "begin_line": 842,
      "end_line": 884,
      "comment": "\n     * Render the specified text and return the rendered Options\n     * in a StringBuffer.\n     *\n     * @param sb The StringBuffer to place the rendered text into.\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be rendered.\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 46)",
        "(line 847,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 72)",
        "(line 855,col 9)-(line 859,col 9)",
        "(line 863,col 9)-(line 863,col 62)",
        "(line 865,col 9)-(line 883,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.findWrapPos(java.lang.String, int, int)",
      "begin_line": 899,
      "end_line": 943,
      "comment": "\n     * Finds the next text wrap position after \u003ccode\u003estartPos\u003c/code\u003e for the\n     * text in \u003ccode\u003etext\u003c/code\u003e with the column width \u003ccode\u003ewidth\u003c/code\u003e.\n     * The wrap point is the last postion before startPos+width having a \n     * whitespace character (space, \\n, \\r).\n     *\n     * @param text The text being searched for the wrap position\n     * @param width width of the wrapped text\n     * @param startPos position from which to start the lookup whitespace\n     * character\n     * @return postion on which the text must be wrapped or -1 if the wrap\n     * position is at the end of the text\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 21)",
        "(line 904,col 9)-(line 912,col 9)",
        "(line 916,col 9)-(line 916,col 31)",
        "(line 918,col 9)-(line 918,col 15)",
        "(line 920,col 9)-(line 924,col 9)",
        "(line 927,col 9)-(line 930,col 9)",
        "(line 934,col 9)-(line 934,col 31)",
        "(line 936,col 9)-(line 940,col 9)",
        "(line 942,col 9)-(line 942,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.createPadding(int)",
      "begin_line": 952,
      "end_line": 962,
      "comment": "\n     * Return a String of padding of length \u003ccode\u003elen\u003c/code\u003e.\n     *\n     * @param len The length of the String of padding to create.\n     *\n     * @return The String of padding\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 48)",
        "(line 956,col 9)-(line 959,col 9)",
        "(line 961,col 9)-(line 961,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.rtrim(java.lang.String)",
      "begin_line": 971,
      "end_line": 986,
      "comment": "\n     * Remove the trailing whitespace from the specified String.\n     *\n     * @param s The String to remove the trailing padding from.\n     *\n     * @return The String of without the trailing padding\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 976,col 9)",
        "(line 978,col 9)-(line 978,col 29)",
        "(line 980,col 9)-(line 983,col 9)",
        "(line 985,col 9)-(line 985,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OptionComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 995,
      "end_line": 1016,
      "comment": "\n     * This class implements the \u003ccode\u003eComparator\u003c/code\u003e interface\n     * for comparing Options.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.OptionComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 1009,
      "end_line": 1015,
      "comment": "\n         * Compares its two arguments for order. Returns a negative\n         * integer, zero, or a positive integer as the first argument\n         * is less than, equal to, or greater than the second.\n         *\n         * @param o1 The first Option to be compared.\n         * @param o2 The second Option to be compared.\n         * @return a negative integer, zero, or a positive integer as\n         *         the first argument is less than, equal to, or greater than the\n         *         second.\n         ",
      "child_ranges": [
        "(line 1011,col 13)-(line 1011,col 38)",
        "(line 1012,col 13)-(line 1012,col 38)",
        "(line 1014,col 13)-(line 1014,col 68)"
      ]
    }
  ]
}