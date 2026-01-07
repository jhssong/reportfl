{
  "filepath": "/tmp/Cli-15b/src/java/org/apache/commons/cli2/option/GroupImpl.java",
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
      "end_line": 489,
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
      "signature": "org.apache.commons.cli2.option.GroupImpl.GroupImpl(java.util.List, java.lang.String, java.lang.String, int, int)",
      "begin_line": 64,
      "end_line": 111,
      "comment": "\n     * Creates a new GroupImpl using the specified parameters.\n     *\n     * @param options the Options and Arguments that make up the Group\n     * @param name the name of this Group, or null\n     * @param description a description of this Group\n     * @param minimum the minimum number of Options for a valid CommandLine\n     * @param maximum the maximum number of Options for a valid CommandLine\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 24)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 39)",
        "(line 73,col 9)-(line 73,col 31)",
        "(line 74,col 9)-(line 74,col 31)",
        "(line 78,col 9)-(line 78,col 61)",
        "(line 81,col 9)-(line 81,col 50)",
        "(line 84,col 9)-(line 84,col 90)",
        "(line 87,col 9)-(line 87,col 46)",
        "(line 90,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 68)",
        "(line 109,col 9)-(line 109,col 73)",
        "(line 110,col 9)-(line 110,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)",
      "begin_line": 113,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 51)",
        "(line 128,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getPrefixes()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getTriggers()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.process(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 156,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 31)",
        "(line 162,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.validate(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 237,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 24)",
        "(line 243,col 9)-(line 243,col 33)",
        "(line 245,col 9)-(line 264,col 9)",
        "(line 267,col 9)-(line 270,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 278,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getPreferredName()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getDescription()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 292,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator, java.lang.String)",
      "begin_line": 298,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 63)",
        "(line 304,col 9)-(line 305,col 89)",
        "(line 307,col 9)-(line 308,col 95)",
        "(line 310,col 9)-(line 312,col 93)",
        "(line 314,col 9)-(line 314,col 99)",
        "(line 316,col 9)-(line 316,col 92)",
        "(line 318,col 9)-(line 318,col 68)",
        "(line 320,col 9)-(line 320,col 47)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 385,col 9)",
        "(line 387,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.helpLines(int, java.util.Set, java.util.Comparator)",
      "begin_line": 392,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 47)",
        "(line 397,col 9)-(line 400,col 9)",
        "(line 402,col 9)-(line 420,col 9)",
        "(line 422,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 429,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getOptions()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\n     * Gets the member Options of thie Group.\n     * Note this does not include any Arguments\n     * @return only the non Argument Options of the Group\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getAnonymous()",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n     * Gets the anonymous Arguments of this Group.\n     * @return the Argument options of this Group\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.findOption(java.lang.String)",
      "begin_line": 449,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 51)",
        "(line 452,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 461,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getMinimum()",
      "begin_line": 464,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getMaximum()",
      "begin_line": 468,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.isRequired()",
      "begin_line": 472,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 476,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 36)",
        "(line 479,col 9)-(line 482,col 9)",
        "(line 484,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReverseStringComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 492,
      "end_line": 514,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 493,
      "end_line": 493,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.ReverseStringComparator.ReverseStringComparator()",
      "begin_line": 495,
      "end_line": 497,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ReverseStringComparator.getInstance()",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * Gets a singleton instance of a ReverseStringComparator\n     * @return the singleton instance\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ReverseStringComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 507,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 38)",
        "(line 510,col 9)-(line 510,col 38)",
        "(line 512,col 9)-(line 512,col 33)"
      ]
    }
  ]
}