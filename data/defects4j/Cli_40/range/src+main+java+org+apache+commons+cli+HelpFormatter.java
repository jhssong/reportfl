{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/HelpFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HelpFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 71,
      "end_line": 1092,
      "comment": "\n * A formatter of help messages for command line options.\n *\n * \u003cp\u003eExample:\u003c/p\u003e\n * \n * \u003cpre\u003e\n * Options options \u003d new Options();\n * options.addOption(OptionBuilder.withLongOpt(\"file\")\n *                                .withDescription(\"The file to be processed\")\n *                                .hasArg()\n *                                .withArgName(\"FILE\")\n *                                .isRequired()\n *                                .create(\u0027f\u0027));\n * options.addOption(OptionBuilder.withLongOpt(\"version\")\n *                                .withDescription(\"Print the version of the application\")\n *                                .create(\u0027v\u0027));\n * options.addOption(OptionBuilder.withLongOpt(\"help\").create(\u0027h\u0027));\n * \n * String header \u003d \"Do something useful with an input file\\n\\n\";\n * String footer \u003d \"\\nPlease report issues at http://example.com/issues\";\n * \n * HelpFormatter formatter \u003d new HelpFormatter();\n * formatter.printHelp(\"myapp\", header, options, footer, true);\n * \u003c/pre\u003e\n * \n * This produces the following output:\n * \n * \u003cpre\u003e\n * usage: myapp -f \u0026lt;FILE\u0026gt; [-h] [-v]\n * Do something useful with an input file\n * \n *  -f,--file \u0026lt;FILE\u0026gt;   The file to be processed\n *  -h,--help\n *  -v,--version       Print the version of the application\n * \n * Please report issues at http://example.com/issues\n * \u003c/pre\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WIDTH"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " default number of characters per line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEFT_PAD"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " default padding to the left of each line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DESC_PAD"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " number of space characters to be prefixed to each description line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SYNTAX_PREFIX"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " the string to display at the beginning of the usage statement "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OPT_PREFIX"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " default prefix for shortOpts "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_PREFIX"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " default prefix for long Option "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_SEPARATOR"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " \n     * default separator displayed between a long Option and its value\n     * \n     * @since 1.3\n     *"
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARG_NAME"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " default name for an argument "
    },
    {
      "type": "field",
      "varNames": [
        "defaultWidth"
      ],
      "begin_line": 111,
      "end_line": 112,
      "comment": "\n     * number of characters per line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setWidth methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLeftPad"
      ],
      "begin_line": 120,
      "end_line": 121,
      "comment": "\n     * amount of padding to the left of each line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setLeftPadding methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultDescPad"
      ],
      "begin_line": 130,
      "end_line": 131,
      "comment": "\n     * the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setDescPadding methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultSyntaxPrefix"
      ],
      "begin_line": 139,
      "end_line": 140,
      "comment": "\n     * the string to display at the beginning of the usage statement\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setSyntaxPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultNewLine"
      ],
      "begin_line": 148,
      "end_line": 149,
      "comment": "\n     * the new line string\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setNewLine methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultOptPrefix"
      ],
      "begin_line": 157,
      "end_line": 158,
      "comment": "\n     * the shortOpt prefix\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setOptPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLongOptPrefix"
      ],
      "begin_line": 166,
      "end_line": 167,
      "comment": "\n     * the long Opt prefix\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setLongOptPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultArgName"
      ],
      "begin_line": 175,
      "end_line": 176,
      "comment": "\n     * the name of the argument\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setArgName methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optionComparator"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": "\n     * Comparator used to sort the options when they output in help text\n     * \n     * Defaults to case-insensitive alphabetical sorting by option key\n     "
    },
    {
      "type": "field",
      "varNames": [
        "longOptSeparator"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " The separator displayed between the long option and its value. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setWidth(int)",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * Sets the \u0027width\u0027.\n     *\n     * @param width the new value of \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getWidth()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * Returns the \u0027width\u0027.\n     *\n     * @return the \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLeftPadding(int)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * Sets the \u0027leftPadding\u0027.\n     *\n     * @param padding the new value of \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLeftPadding()",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * Returns the \u0027leftPadding\u0027.\n     *\n     * @return the \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setDescPadding(int)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n     * Sets the \u0027descPadding\u0027.\n     *\n     * @param padding the new value of \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getDescPadding()",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\n     * Returns the \u0027descPadding\u0027.\n     *\n     * @return the \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setSyntaxPrefix(java.lang.String)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * Sets the \u0027syntaxPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getSyntaxPrefix()",
      "begin_line": 263,
      "end_line": 266,
      "comment": "\n     * Returns the \u0027syntaxPrefix\u0027.\n     *\n     * @return the \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setNewLine(java.lang.String)",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\n     * Sets the \u0027newLine\u0027.\n     *\n     * @param newline the new value of \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getNewLine()",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\n     * Returns the \u0027newLine\u0027.\n     *\n     * @return the \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptPrefix(java.lang.String)",
      "begin_line": 293,
      "end_line": 296,
      "comment": "\n     * Sets the \u0027optPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptPrefix()",
      "begin_line": 303,
      "end_line": 306,
      "comment": "\n     * Returns the \u0027optPrefix\u0027.\n     *\n     * @return the \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptPrefix(java.lang.String)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\n     * Sets the \u0027longOptPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptPrefix()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "\n     * Returns the \u0027longOptPrefix\u0027.\n     *\n     * @return the \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptSeparator(java.lang.String)",
      "begin_line": 336,
      "end_line": 339,
      "comment": "\n     * Set the separator displayed between a long option and its value.\n     * Ensure that the separator specified is supported by the parser used,\n     * typically \u0027 \u0027 or \u0027\u003d\u0027.\n     * \n     * @param longOptSeparator the separator, typically \u0027 \u0027 or \u0027\u003d\u0027.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptSeparator()",
      "begin_line": 347,
      "end_line": 350,
      "comment": "\n     * Returns the separator displayed between a long option and its value.\n     * \n     * @return the separator\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setArgName(java.lang.String)",
      "begin_line": 357,
      "end_line": 360,
      "comment": "\n     * Sets the \u0027argName\u0027.\n     *\n     * @param name the new value of \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getArgName()",
      "begin_line": 367,
      "end_line": 370,
      "comment": "\n     * Returns the \u0027argName\u0027.\n     *\n     * @return the \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptionComparator()",
      "begin_line": 379,
      "end_line": 382,
      "comment": "\n     * Comparator used to sort the options when they output in help text.\n     * Defaults to case-insensitive alphabetical sorting by option key.\n     *\n     * @return the {@link Comparator} currently in use to sort the options\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptionComparator(java.util.Comparator\u003corg.apache.commons.cli.Option\u003e)",
      "begin_line": 391,
      "end_line": 394,
      "comment": "\n     * Set the comparator used to sort the options when they output in help text.\n     * Passing in a null comparator will keep the options in the order they were declared.\n     *\n     * @param comparator the {@link Comparator} to use for sorting the options\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 404,
      "end_line": 407,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options, boolean)",
      "begin_line": 419,
      "end_line": 422,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 434,
      "end_line": 437,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 451,
      "end_line": 454,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 467,
      "end_line": 470,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 485,
      "end_line": 492,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 59)",
        "(line 490,col 9)-(line 490,col 116)",
        "(line 491,col 9)-(line 491,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)",
      "begin_line": 511,
      "end_line": 516,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     *\n     * @throws IllegalStateException if there is no room to print a line\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String, boolean)",
      "begin_line": 538,
      "end_line": 567,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     *\n     * @throws IllegalStateException if there is no room to print a line\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 545,col 9)",
        "(line 547,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 559,col 9)",
        "(line 561,col 9)-(line 561,col 59)",
        "(line 563,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 577,
      "end_line": 632,
      "comment": "\n     * Prints the usage statement for the specified application.\n     *\n     * @param pw The PrintWriter to print the usage statement \n     * @param width The number of characters to display per line\n     * @param app The application name\n     * @param options The command line Options\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 94)",
        "(line 583,col 9)-(line 583,col 85)",
        "(line 585,col 9)-(line 585,col 81)",
        "(line 586,col 9)-(line 589,col 9)",
        "(line 591,col 9)-(line 627,col 9)",
        "(line 631,col 9)-(line 631,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)",
      "begin_line": 642,
      "end_line": 670,
      "comment": "\n     * Appends the usage clause for an OptionGroup to a StringBuffer.  \n     * The clause is wrapped in square brackets if the group is required.\n     * The display of the options is handled by appendOption\n     * @param buff the StringBuffer to append to\n     * @param group the group to append\n     * @see #appendOption(StringBuffer,Option,boolean)\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 647,col 9)",
        "(line 649,col 9)-(line 649,col 79)",
        "(line 650,col 9)-(line 653,col 9)",
        "(line 655,col 9)-(line 664,col 9)",
        "(line 666,col 9)-(line 669,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)",
      "begin_line": 679,
      "end_line": 707,
      "comment": "\n     * Appends the usage clause for an Option to a StringBuffer.  \n     *\n     * @param buff the StringBuffer to append to\n     * @param option the Option to append\n     * @param required whether the Option is required or not\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 684,col 9)",
        "(line 686,col 9)-(line 693,col 9)",
        "(line 696,col 9)-(line 700,col 9)",
        "(line 703,col 9)-(line 706,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 717,
      "end_line": 722,
      "comment": "\n     * Print the cmdLineSyntax to the specified writer, using the\n     * specified width.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters per line for the usage statement.\n     * @param cmdLineSyntax The usage statement.\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 58)",
        "(line 721,col 9)-(line 721,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printOptions(java.io.PrintWriter, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 736,
      "end_line": 743,
      "comment": "\n     * Print the help for the specified Options to the specified writer, \n     * using the specified width, left padding and description padding.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 51)",
        "(line 741,col 9)-(line 741,col 60)",
        "(line 742,col 9)-(line 742,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 752,
      "end_line": 755,
      "comment": "\n     * Print the specified text to the specified PrintWriter.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, int, java.lang.String)",
      "begin_line": 765,
      "end_line": 771,
      "comment": "\n     * Print the specified text to the specified PrintWriter.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 64)",
        "(line 769,col 9)-(line 769,col 65)",
        "(line 770,col 9)-(line 770,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderOptions(java.lang.StringBuffer, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 789,
      "end_line": 875,
      "comment": "\n     * Render the specified Options and return the rendered Options\n     * in a StringBuffer.\n     *\n     * @param sb The StringBuffer to place the rendered Options into.\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 51)",
        "(line 792,col 9)-(line 792,col 51)",
        "(line 798,col 9)-(line 798,col 20)",
        "(line 799,col 9)-(line 799,col 76)",
        "(line 801,col 9)-(line 801,col 59)",
        "(line 803,col 9)-(line 806,col 9)",
        "(line 808,col 9)-(line 843,col 9)",
        "(line 845,col 9)-(line 845,col 18)",
        "(line 847,col 9)-(line 872,col 9)",
        "(line 874,col 9)-(line 874,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderWrappedText(java.lang.StringBuffer, int, int, java.lang.String)",
      "begin_line": 888,
      "end_line": 929,
      "comment": "\n     * Render the specified text and return the rendered Options\n     * in a StringBuffer.\n     *\n     * @param sb The StringBuffer to place the rendered text into.\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be rendered.\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 46)",
        "(line 893,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 70)",
        "(line 901,col 9)-(line 905,col 9)",
        "(line 908,col 9)-(line 908,col 62)",
        "(line 910,col 9)-(line 928,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderWrappedTextBlock(java.lang.StringBuffer, int, int, java.lang.String)",
      "begin_line": 940,
      "end_line": 966,
      "comment": "\n     * Render the specified text width a maximum width. This method differs\n     * from renderWrappedText by not removing leading spaces after a new line.\n     *\n     * @param sb The StringBuffer to place the rendered text into.\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be rendered.\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 963,col 9)",
        "(line 965,col 9)-(line 965,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.findWrapPos(java.lang.String, int, int)",
      "begin_line": 982,
      "end_line": 1022,
      "comment": "\n     * Finds the next text wrap position after \u003ccode\u003estartPos\u003c/code\u003e for the\n     * text in \u003ccode\u003etext\u003c/code\u003e with the column width \u003ccode\u003ewidth\u003c/code\u003e.\n     * The wrap point is the last position before startPos+width having a \n     * whitespace character (space, \\n, \\r). If there is no whitespace character\n     * before startPos+width, it will return startPos+width.\n     *\n     * @param text The text being searched for the wrap position\n     * @param width width of the wrapped text\n     * @param startPos position from which to start the lookup whitespace\n     * character\n     * @return position on which the text must be wrapped or -1 if the wrap\n     * position is at the end of the text\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 47)",
        "(line 986,col 9)-(line 989,col 9)",
        "(line 991,col 9)-(line 991,col 43)",
        "(line 992,col 9)-(line 995,col 9)",
        "(line 997,col 9)-(line 1000,col 9)",
        "(line 1003,col 9)-(line 1010,col 9)",
        "(line 1013,col 9)-(line 1016,col 9)",
        "(line 1019,col 9)-(line 1019,col 31)",
        "(line 1021,col 9)-(line 1021,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.createPadding(int)",
      "begin_line": 1031,
      "end_line": 1037,
      "comment": "\n     * Return a String of padding of length \u003ccode\u003elen\u003c/code\u003e.\n     *\n     * @param len The length of the String of padding to create.\n     *\n     * @return The String of padding\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 45)",
        "(line 1034,col 9)-(line 1034,col 34)",
        "(line 1036,col 9)-(line 1036,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.rtrim(java.lang.String)",
      "begin_line": 1046,
      "end_line": 1061,
      "comment": "\n     * Remove the trailing whitespace from the specified String.\n     *\n     * @param s The String to remove the trailing padding from.\n     *\n     * @return The String of without the trailing padding\n     ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1051,col 9)",
        "(line 1053,col 9)-(line 1053,col 29)",
        "(line 1055,col 9)-(line 1058,col 9)",
        "(line 1060,col 9)-(line 1060,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OptionComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003corg.apache.commons.cli.Option\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 1070,
      "end_line": 1090,
      "comment": "\n     * This class implements the \u003ccode\u003eComparator\u003c/code\u003e interface\n     * for comparing Options.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1073,
      "end_line": 1073,
      "comment": " The serial version UID. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.OptionComparator.compare(org.apache.commons.cli.Option, org.apache.commons.cli.Option)",
      "begin_line": 1086,
      "end_line": 1089,
      "comment": "\n         * Compares its two arguments for order. Returns a negative\n         * integer, zero, or a positive integer as the first argument\n         * is less than, equal to, or greater than the second.\n         *\n         * @param opt1 The first Option to be compared.\n         * @param opt2 The second Option to be compared.\n         * @return a negative integer, zero, or a positive integer as\n         *         the first argument is less than, equal to, or greater than the\n         *         second.\n         ",
      "child_ranges": [
        "(line 1088,col 13)-(line 1088,col 68)"
      ]
    }
  ]
}