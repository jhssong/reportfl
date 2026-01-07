{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/option/GroupImpl.java",
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
      "end_line": 492,
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
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 24)",
        "(line 243,col 9)-(line 243,col 33)",
        "(line 245,col 9)-(line 267,col 9)",
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
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 63)",
        "(line 307,col 9)-(line 308,col 89)",
        "(line 310,col 9)-(line 311,col 95)",
        "(line 313,col 9)-(line 315,col 93)",
        "(line 317,col 9)-(line 317,col 99)",
        "(line 319,col 9)-(line 319,col 92)",
        "(line 321,col 9)-(line 321,col 68)",
        "(line 323,col 9)-(line 323,col 47)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.helpLines(int, java.util.Set, java.util.Comparator)",
      "begin_line": 395,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 47)",
        "(line 400,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 423,col 9)",
        "(line 425,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 432,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getOptions()",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\n     * Gets the member Options of thie Group.\n     * Note this does not include any Arguments\n     * @return only the non Argument Options of the Group\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getAnonymous()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * Gets the anonymous Arguments of this Group.\n     * @return the Argument options of this Group\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.findOption(java.lang.String)",
      "begin_line": 452,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 51)",
        "(line 455,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 464,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getMinimum()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.getMaximum()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.isRequired()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.GroupImpl.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 479,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 36)",
        "(line 482,col 9)-(line 485,col 9)",
        "(line 487,col 9)-(line 490,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReverseStringComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 495,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 496,
      "end_line": 496,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.ReverseStringComparator.ReverseStringComparator()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ReverseStringComparator.getInstance()",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\n     * Gets a singleton instance of a ReverseStringComparator\n     * @return the singleton instance\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ReverseStringComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 510,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 38)",
        "(line 513,col 9)-(line 513,col 38)",
        "(line 515,col 9)-(line 515,col 33)"
      ]
    }
  ]
}