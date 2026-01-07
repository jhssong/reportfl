{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/option/GroupImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GroupImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.option.OptionImpl",
        "org.apache.commons.cli2.Group"
      ],
      "begin_line": 44,
      "end_line": 515,
      "comment": "\n * An implementation of Group\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "anonymous"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "optionMap"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.GroupImpl.GroupImpl(java.util.List, java.lang.String, java.lang.String, int, int, boolean)",
      "begin_line": 65,
      "end_line": 114,
      "comment": "\n     * Creates a new GroupImpl using the specified parameters.\n     *\n     * @param options the Options and Arguments that make up the Group\n     * @param name the name of this Group, or null\n     * @param description a description of this Group\n     * @param minimum the minimum number of Options for a valid CommandLine\n     * @param maximum the maximum number of Options for a valid CommandLine\n     * @param required a flag whether this group is required\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 27)",
        "(line 73,col 9)-(line 73,col 25)",
        "(line 74,col 9)-(line 74,col 39)",
        "(line 75,col 9)-(line 75,col 31)",
        "(line 76,col 9)-(line 76,col 31)",
        "(line 80,col 9)-(line 80,col 61)",
        "(line 83,col 9)-(line 83,col 50)",
        "(line 86,col 9)-(line 86,col 90)",
        "(line 89,col 9)-(line 89,col 46)",
        "(line 92,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 68)",
        "(line 112,col 9)-(line 112,col 73)",
        "(line 113,col 9)-(line 113,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)",
      "begin_line": 116,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 128,col 9)-(line 128,col 51)",
        "(line 131,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getPrefixes()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getTriggers()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.process(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 159,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 31)",
        "(line 165,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.validate(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 240,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 24)",
        "(line 246,col 9)-(line 246,col 33)",
        "(line 248,col 9)-(line 267,col 9)",
        "(line 270,col 9)-(line 273,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 281,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getPreferredName()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getDescription()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 295,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator, java.lang.String)",
      "begin_line": 301,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 63)",
        "(line 307,col 9)-(line 309,col 96)",
        "(line 311,col 9)-(line 312,col 95)",
        "(line 314,col 9)-(line 316,col 93)",
        "(line 318,col 9)-(line 318,col 99)",
        "(line 320,col 9)-(line 320,col 92)",
        "(line 322,col 9)-(line 322,col 68)",
        "(line 324,col 9)-(line 324,col 47)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.helpLines(int, java.util.Set, java.util.Comparator)",
      "begin_line": 396,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 47)",
        "(line 401,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 424,col 9)",
        "(line 426,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getOptions()",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Gets the member Options of thie Group.\n     * Note this does not include any Arguments\n     * @return only the non Argument Options of the Group\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getAnonymous()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Gets the anonymous Arguments of this Group.\n     * @return the Argument options of this Group\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.findOption(java.lang.String)",
      "begin_line": 453,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 51)",
        "(line 456,col 9)-(line 463,col 9)",
        "(line 465,col 9)-(line 465,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getMinimum()",
      "begin_line": 468,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getMaximum()",
      "begin_line": 472,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.isRequired()",
      "begin_line": 483,
      "end_line": 486,
      "comment": "\n     * Tests whether this option is required. For groups we evaluate the\n     * \u003ccode\u003erequired\u003c/code\u003e flag common to all options, but also take the\n     * minimum constraints into account.\n     *\n     * @return a flag whether this option is required\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 488,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 36)",
        "(line 491,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.looksLikeOption(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)",
      "begin_line": 511,
      "end_line": 514,
      "comment": "\n     * Helper method for testing whether an element of the command line looks\n     * like an option. This method queries the command line, but sets the\n     * current option first.\n     *\n     * @param commandLine the command line\n     * @param trigger the trigger to be checked\n     * @return a flag whether this element looks like an option\n     ",
      "child_ranges": [
        "(line 513,col 13)-(line 513,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReverseStringComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 518,
      "end_line": 540,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.ReverseStringComparator.ReverseStringComparator()",
      "begin_line": 521,
      "end_line": 523,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ReverseStringComparator.getInstance()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n     * Gets a singleton instance of a ReverseStringComparator\n     * @return the singleton instance\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ReverseStringComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 533,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 38)",
        "(line 536,col 9)-(line 536,col 38)",
        "(line 538,col 9)-(line 538,col 33)"
      ]
    }
  ]
}