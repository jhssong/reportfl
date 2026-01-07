{
  "filepath": "/tmp/JxPath-15b/src/java/org/apache/commons/jxpath/ri/compiler/CoreFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Operation"
      ],
      "begin_line": 43,
      "end_line": 727,
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
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 20)",
        "(line 50,col 9)-(line 50,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getFunctionCode()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getFunctionName()",
      "begin_line": 57,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg1()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg2()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg3()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArgumentCount()",
      "begin_line": 133,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.computeContextDependent()",
      "begin_line": 145,
      "end_line": 189,
      "comment": "\n     * Returns true if any argument is context dependent or if\n     * the function is last(), position(), boolean(), local-name(),\n     * name(), string(), lang(), number().\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.toString()",
      "begin_line": 191,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 49)",
        "(line 193,col 9)-(line 193,col 41)",
        "(line 194,col 9)-(line 194,col 27)",
        "(line 195,col 9)-(line 195,col 43)",
        "(line 196,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 27)",
        "(line 205,col 9)-(line 205,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 215,
      "end_line": 279,
      "comment": "\n     * Computes a built-in function\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 281,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 26)",
        "(line 285,col 9)-(line 285,col 47)",
        "(line 286,col 9)-(line 286,col 24)",
        "(line 287,col 9)-(line 287,col 22)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionPosition(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 26)",
        "(line 301,col 9)-(line 301,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCount(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 304,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 26)",
        "(line 306,col 9)-(line 306,col 36)",
        "(line 307,col 9)-(line 307,col 22)",
        "(line 308,col 9)-(line 308,col 45)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 331,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 26)",
        "(line 333,col 9)-(line 333,col 79)",
        "(line 334,col 9)-(line 334,col 75)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 341,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 26)",
        "(line 343,col 9)-(line 343,col 77)",
        "(line 344,col 9)-(line 344,col 65)",
        "(line 345,col 9)-(line 345,col 78)",
        "(line 346,col 9)-(line 346,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 349,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 26)",
        "(line 351,col 9)-(line 351,col 78)",
        "(line 352,col 9)-(line 352,col 50)",
        "(line 353,col 9)-(line 353,col 30)",
        "(line 354,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 65)",
        "(line 363,col 9)-(line 363,col 68)",
        "(line 364,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 376,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 26)",
        "(line 383,col 9)-(line 383,col 48)",
        "(line 384,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 395,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 26)",
        "(line 401,col 9)-(line 401,col 48)",
        "(line 402,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 412,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 26)",
        "(line 418,col 9)-(line 418,col 48)",
        "(line 419,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 429,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 26)",
        "(line 434,col 9)-(line 434,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 437,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 49)",
        "(line 442,col 9)-(line 442,col 43)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 449,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 26)",
        "(line 451,col 9)-(line 451,col 77)",
        "(line 452,col 9)-(line 452,col 77)",
        "(line 453,col 9)-(line 453,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 456,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 26)",
        "(line 458,col 9)-(line 458,col 77)",
        "(line 459,col 9)-(line 459,col 77)",
        "(line 460,col 9)-(line 460,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 463,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 26)",
        "(line 465,col 9)-(line 465,col 77)",
        "(line 466,col 9)-(line 466,col 77)",
        "(line 467,col 9)-(line 467,col 35)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 471,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 474,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 26)",
        "(line 476,col 9)-(line 476,col 77)",
        "(line 477,col 9)-(line 477,col 77)",
        "(line 478,col 9)-(line 478,col 35)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 485,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 36)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 491,col 9)-(line 491,col 77)",
        "(line 492,col 9)-(line 492,col 79)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 497,col 9)-(line 497,col 32)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 508,col 69)",
        "(line 509,col 9)-(line 509,col 36)",
        "(line 510,col 9)-(line 512,col 9)",
        "(line 514,col 9)-(line 514,col 34)",
        "(line 515,col 9)-(line 517,col 9)",
        "(line 519,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 532,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 17)",
        "(line 534,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNormalizeSpace(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 544,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 26)",
        "(line 546,col 9)-(line 546,col 76)",
        "(line 547,col 9)-(line 547,col 39)",
        "(line 548,col 9)-(line 548,col 20)",
        "(line 549,col 9)-(line 549,col 22)",
        "(line 550,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 575,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 26)",
        "(line 577,col 9)-(line 577,col 77)",
        "(line 578,col 9)-(line 578,col 77)",
        "(line 579,col 9)-(line 579,col 77)",
        "(line 580,col 9)-(line 580,col 40)",
        "(line 581,col 9)-(line 581,col 20)",
        "(line 582,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 597,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 26)",
        "(line 599,col 9)-(line 601,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNot(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 604,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 26)",
        "(line 606,col 9)-(line 608,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTrue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 611,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 26)",
        "(line 613,col 9)-(line 613,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFalse(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 616,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 26)",
        "(line 618,col 9)-(line 618,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNull(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 621,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 26)",
        "(line 623,col 9)-(line 623,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 626,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 26)",
        "(line 631,col 9)-(line 631,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSum(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 634,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 26)",
        "(line 636,col 9)-(line 636,col 46)",
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 650,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFloor(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 653,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 26)",
        "(line 655,col 9)-(line 655,col 76)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCeiling(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 662,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 26)",
        "(line 664,col 9)-(line 664,col 76)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionRound(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 671,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 26)",
        "(line 673,col 9)-(line 673,col 76)",
        "(line 674,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 677,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFormatNumber(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 680,
      "end_line": 714,
      "comment": "",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 36)",
        "(line 682,col 9)-(line 684,col 9)",
        "(line 686,col 9)-(line 687,col 69)",
        "(line 688,col 9)-(line 689,col 69)",
        "(line 691,col 9)-(line 691,col 44)",
        "(line 692,col 9)-(line 708,col 9)",
        "(line 710,col 9)-(line 710,col 74)",
        "(line 711,col 9)-(line 711,col 48)",
        "(line 712,col 9)-(line 712,col 46)",
        "(line 713,col 9)-(line 713,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.assertArgCount(int)",
      "begin_line": 716,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.assertArgRange(int, int)",
      "begin_line": 720,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 36)",
        "(line 722,col 9)-(line 725,col 9)"
      ]
    }
  ]
}