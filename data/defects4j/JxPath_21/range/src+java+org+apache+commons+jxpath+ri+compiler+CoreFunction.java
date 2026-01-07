{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/compiler/CoreFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Operation"
      ],
      "begin_line": 43,
      "end_line": 930,
      "comment": "\n * An element of the compile tree representing one of built-in functions\n * like \"position()\" or \"number()\".\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionCode"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.CoreFunction(int, org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Create a new CoreFunction.\n     * @param functionCode int function code\n     * @param args argument Expressions\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)",
        "(line 55,col 9)-(line 55,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getFunctionCode()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Get the function code.\n     * @return int function code\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getFunctionName()",
      "begin_line": 70,
      "end_line": 135,
      "comment": "\n     * Get the name of this function.\n     * @return String function name\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg1()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Convenience method to return the first argument.\n     * @return Expression\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg2()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Convenience method to return the second argument.\n     * @return Expression\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg3()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Convenience method to return the third argument.\n     * @return Expression\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArgumentCount()",
      "begin_line": 165,
      "end_line": 170,
      "comment": "\n     * Return the number of argument Expressions.\n     * @return int count\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.computeContextDependent()",
      "begin_line": 178,
      "end_line": 222,
      "comment": "\n     * Returns true if any argument is context dependent or if\n     * the function is last(), position(), boolean(), local-name(),\n     * name(), string(), lang(), number().\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.toString()",
      "begin_line": 224,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 49)",
        "(line 226,col 9)-(line 226,col 41)",
        "(line 227,col 9)-(line 227,col 27)",
        "(line 228,col 9)-(line 228,col 43)",
        "(line 229,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 27)",
        "(line 238,col 9)-(line 238,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 245,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 311,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 319,
      "end_line": 335,
      "comment": "\n     * last() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 26)",
        "(line 323,col 9)-(line 323,col 47)",
        "(line 324,col 9)-(line 324,col 24)",
        "(line 325,col 9)-(line 325,col 22)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionPosition(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 342,
      "end_line": 345,
      "comment": "\n     * position() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 26)",
        "(line 344,col 9)-(line 344,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCount(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 352,
      "end_line": 377,
      "comment": "\n     * count() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 26)",
        "(line 354,col 9)-(line 354,col 36)",
        "(line 355,col 9)-(line 355,col 22)",
        "(line 356,col 9)-(line 356,col 45)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 384,
      "end_line": 392,
      "comment": "\n     * lang() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 26)",
        "(line 386,col 9)-(line 386,col 79)",
        "(line 387,col 9)-(line 387,col 75)",
        "(line 388,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 399,
      "end_line": 405,
      "comment": "\n     * id() implementation.\n     * @param context evaluation context\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 26)",
        "(line 401,col 9)-(line 401,col 77)",
        "(line 402,col 9)-(line 402,col 65)",
        "(line 403,col 9)-(line 403,col 78)",
        "(line 404,col 9)-(line 404,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 412,
      "end_line": 438,
      "comment": "\n     * key() implementation.\n     * @param context evaluation context\n     * @return various Object\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 26)",
        "(line 414,col 9)-(line 414,col 78)",
        "(line 415,col 9)-(line 415,col 50)",
        "(line 416,col 9)-(line 416,col 30)",
        "(line 417,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 65)",
        "(line 427,col 9)-(line 427,col 68)",
        "(line 428,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 445,
      "end_line": 462,
      "comment": "\n     * namespace-uri() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 26)",
        "(line 452,col 9)-(line 452,col 48)",
        "(line 453,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 469,
      "end_line": 484,
      "comment": "\n     * local-name() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 26)",
        "(line 475,col 9)-(line 475,col 48)",
        "(line 476,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 491,
      "end_line": 506,
      "comment": "\n     * name() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 26)",
        "(line 497,col 9)-(line 497,col 48)",
        "(line 498,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 513,
      "end_line": 519,
      "comment": "\n     * string() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 26)",
        "(line 518,col 9)-(line 518,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 526,
      "end_line": 536,
      "comment": "\n     * concat() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 49)",
        "(line 531,col 9)-(line 531,col 43)",
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 543,
      "end_line": 548,
      "comment": "\n     * starts-with() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 26)",
        "(line 545,col 9)-(line 545,col 77)",
        "(line 546,col 9)-(line 546,col 77)",
        "(line 547,col 9)-(line 547,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionEndsWith(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 556,
      "end_line": 561,
      "comment": "\n     * ends-with() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 26)",
        "(line 558,col 9)-(line 558,col 77)",
        "(line 559,col 9)-(line 559,col 77)",
        "(line 560,col 9)-(line 560,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 568,
      "end_line": 573,
      "comment": "\n     * contains() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 26)",
        "(line 570,col 9)-(line 570,col 77)",
        "(line 571,col 9)-(line 571,col 77)",
        "(line 572,col 9)-(line 572,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 580,
      "end_line": 589,
      "comment": "\n     * substring-before() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 26)",
        "(line 582,col 9)-(line 582,col 77)",
        "(line 583,col 9)-(line 583,col 77)",
        "(line 584,col 9)-(line 584,col 35)",
        "(line 585,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 596,
      "end_line": 605,
      "comment": "\n     * substring-after() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 26)",
        "(line 598,col 9)-(line 598,col 77)",
        "(line 599,col 9)-(line 599,col 77)",
        "(line 600,col 9)-(line 600,col 35)",
        "(line 601,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 612,
      "end_line": 657,
      "comment": "\n     * substring() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 30)",
        "(line 614,col 9)-(line 614,col 30)",
        "(line 615,col 9)-(line 615,col 41)",
        "(line 616,col 9)-(line 616,col 36)",
        "(line 618,col 9)-(line 618,col 77)",
        "(line 619,col 9)-(line 619,col 79)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 624,col 9)-(line 624,col 32)",
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 635,col 69)",
        "(line 636,col 9)-(line 636,col 36)",
        "(line 637,col 9)-(line 639,col 9)",
        "(line 641,col 9)-(line 641,col 34)",
        "(line 642,col 9)-(line 644,col 9)",
        "(line 646,col 9)-(line 651,col 9)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 664,
      "end_line": 674,
      "comment": "\n     * string-length() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 17)",
        "(line 666,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNormalizeSpace(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 681,
      "end_line": 707,
      "comment": "\n     * normalize-space() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 26)",
        "(line 683,col 9)-(line 683,col 76)",
        "(line 684,col 9)-(line 684,col 39)",
        "(line 685,col 9)-(line 685,col 20)",
        "(line 686,col 9)-(line 686,col 22)",
        "(line 687,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 714,
      "end_line": 735,
      "comment": "\n     * translate() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 31)",
        "(line 716,col 9)-(line 716,col 33)",
        "(line 717,col 9)-(line 717,col 77)",
        "(line 718,col 9)-(line 718,col 77)",
        "(line 719,col 9)-(line 719,col 77)",
        "(line 720,col 9)-(line 720,col 40)",
        "(line 721,col 9)-(line 721,col 20)",
        "(line 722,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 742,
      "end_line": 747,
      "comment": "\n     * boolean() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 26)",
        "(line 744,col 9)-(line 746,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNot(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 754,
      "end_line": 759,
      "comment": "\n     * not() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 26)",
        "(line 756,col 9)-(line 758,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTrue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 766,
      "end_line": 769,
      "comment": "\n     * true() implementation.\n     * @param context evaluation context\n     * @return Boolean.TRUE\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 26)",
        "(line 768,col 9)-(line 768,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFalse(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 776,
      "end_line": 779,
      "comment": "\n     * false() implementation.\n     * @param context evaluation context\n     * @return Boolean.FALSE\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 26)",
        "(line 778,col 9)-(line 778,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNull(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 786,
      "end_line": 789,
      "comment": "\n     * null() implementation.\n     * @param context evaluation context\n     * @return null\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 26)",
        "(line 788,col 9)-(line 788,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 796,
      "end_line": 802,
      "comment": "\n     * number() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 26)",
        "(line 801,col 9)-(line 801,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSum(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 809,
      "end_line": 826,
      "comment": "\n     * sum() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 26)",
        "(line 811,col 9)-(line 811,col 46)",
        "(line 812,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 825,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFloor(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 833,
      "end_line": 840,
      "comment": "\n     * floor() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 26)",
        "(line 835,col 9)-(line 835,col 76)",
        "(line 836,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 839,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCeiling(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 847,
      "end_line": 854,
      "comment": "\n     * ceiling() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 26)",
        "(line 849,col 9)-(line 849,col 76)",
        "(line 850,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionRound(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 861,
      "end_line": 868,
      "comment": "\n     * round() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 26)",
        "(line 863,col 9)-(line 863,col 76)",
        "(line 864,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFormatNumber(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 875,
      "end_line": 908,
      "comment": "\n     * format-number() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 30)",
        "(line 877,col 9)-(line 877,col 30)",
        "(line 878,col 9)-(line 878,col 41)",
        "(line 880,col 9)-(line 881,col 69)",
        "(line 882,col 9)-(line 883,col 69)",
        "(line 885,col 9)-(line 885,col 44)",
        "(line 886,col 9)-(line 902,col 9)",
        "(line 904,col 9)-(line 904,col 74)",
        "(line 905,col 9)-(line 905,col 48)",
        "(line 906,col 9)-(line 906,col 46)",
        "(line 907,col 9)-(line 907,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.assertArgCount(int)",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n     * Assert \u003ccode\u003ecount\u003c/code\u003e args.\n     * @param count int\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.assertArgRange(int, int)",
      "begin_line": 923,
      "end_line": 929,
      "comment": "\n     * Assert at least \u003ccode\u003emin\u003c/code\u003e/at most \u003ccode\u003emax\u003c/code\u003e args.\n     * @param min int\n     * @param max int\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 36)",
        "(line 925,col 9)-(line 928,col 9)"
      ]
    }
  ]
}