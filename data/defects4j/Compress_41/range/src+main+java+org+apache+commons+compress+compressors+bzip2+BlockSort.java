{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockSort",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 1079,
      "comment": "\n * Encapsulates the Burrows-Wheeler sorting algorithm needed by {@link\n * BZip2CompressorOutputStream}.\n *\n * \u003cp\u003eThis class is based on a Java port of Julian Seward\u0027s\n * blocksort.c in his libbzip2\u003c/p\u003e\n *\n * \u003cp\u003eThe Burrows-Wheeler transform is a reversible transform of the\n * original data that is supposed to group similiar bytes close to\n * each other.  The idea is to sort all permutations of the input and\n * only keep the last byte of each permutation.  E.g. for \"Commons\n * Compress\" you\u0027d get:\u003c/p\u003e\n *\n * \u003cpre\u003e\n *  CompressCommons\n * Commons Compress\n * CompressCommons \n * essCommons Compr\n * mmons CompressCo\n * mons CompressCom\n * mpressCommons Co\n * ns CompressCommo\n * ommons CompressC\n * ompressCommons C\n * ons CompressComm\n * pressCommons Com\n * ressCommons Comp\n * s CompressCommon\n * sCommons Compres\n * ssCommons Compre\n * \u003c/pre\u003e\n *\n * \u003cp\u003eWhich results in a new text \"ss romooCCmmpnse\", in adition the\n * index of the first line that contained the original text is kept -\n * in this case it is 1.  The idea is that in a long English text all\n * permutations that start with \"he\" are likely suffixes of a \"the\" and\n * thus they end in \"t\" leading to a larger block of \"t\"s that can\n * better be compressed by the subsequent Move-to-Front, run-length\n * und Huffman encoding steps.\u003c/p\u003e\n *\n * \u003cp\u003eFor more information see for example:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003e\u003ca\n *   href\u003d\"http://www.hpl.hp.com/techreports/Compaq-DEC/SRC-RR-124.pdf\"\u003eBurrows,\n *   M. and Wheeler, D.: A Block-sorting Lossless Data Compression\n *   Algorithm\u003c/a\u003e\u003c/li\u003e\n *   \u003cli\u003e\u003ca href\u003d\"http://webglimpse.net/pubs/suffix.pdf\"\u003eManber, U. and\n *   Myers, G.: Suffix arrays: A new method for on-line string\n *   searches\u003c/a\u003e\u003c/li\u003e\n *   \u003cli\u003e\u003ca\n *   href\u003d\"http://www.cs.tufts.edu/~nr/comp150fp/archive/bob-sedgewick/fast-strings.pdf\"\u003eBentley,\n *   J.L. and Sedgewick, R.: Fast Algorithms for Sorting and Searching\n *   Strings\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "QSORT_STACK_SIZE"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * LBZ2: If you are ever unlucky/improbable enough to get a stack\n     * overflow whilst sorting, increase the following constant and\n     * try again. In practice I have never seen the stack go above 27\n     * elems, so the following limit seems very generous.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FALLBACK_QSORT_STACK_SIZE"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STACK_SIZE"
      ],
      "begin_line": 120,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "workDone"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Used when sorting. If too many long comparisons happen, we stop sorting,\n     * and use fallbackSort instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "workLimit"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstAttempt"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stack_ll"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_hh"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_dd"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_runningOrder"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_copy"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_bigDone"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ftab"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " 262148 byte"
    },
    {
      "type": "field",
      "varNames": [
        "quadrant"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * Array instance identical to Data\u0027s sfmap, both are used only\n     * temporarily and indepently, so we do not need to allocate\n     * additional memory.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.BlockSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.blockSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int)",
      "begin_line": 153,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 44)",
        "(line 155,col 9)-(line 155,col 26)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 158,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 37)",
        "(line 169,col 9)-(line 169,col 26)",
        "(line 170,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.fallbackSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int)",
      "begin_line": 185,
      "end_line": 198,
      "comment": "\n     * Adapt fallbackSort to the expected interface of the rest of the\n     * code, in particular deal with the fact that block starts at\n     * offset 1 (in libbzip2 1.0.6 it starts at 0).\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 45)",
        "(line 188,col 9)-(line 188,col 54)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.fallbackSimpleSort(int[], int[], int, int)",
      "begin_line": 267,
      "end_line": 296,
      "comment": "\n     * @param fmap points to the index of the starting point of a\n     *        permutation inside the block of data in the current\n     *        partially sorted order\n     * @param eclass points from the index of a character inside the\n     *        block to the first index in fmap that contains the\n     *        bucket of its suffix that is sorted in this step.\n     * @param lo lower boundary of the fmap-interval to be sorted \n     * @param hi upper boundary of the fmap-interval to be sorted \n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 14)",
        "(line 276,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 295,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FALLBACK_QSORT_SMALL_THRESH"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.fswap(int[], int, int)",
      "begin_line": 303,
      "end_line": 307,
      "comment": "\n     * swaps two values in fmap\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 36)",
        "(line 305,col 9)-(line 305,col 30)",
        "(line 306,col 9)-(line 306,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.fvswap(int[], int, int, int)",
      "begin_line": 312,
      "end_line": 317,
      "comment": "\n     * swaps two intervals starting at yyp1 and yyp2 of length yyn inside fmap.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.fmin(int, int)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.fpush(int, int, int)",
      "begin_line": 323,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 26)",
        "(line 325,col 9)-(line 325,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.fpop(int)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.fallbackQSort3(int[], int[], int, int)",
      "begin_line": 342,
      "end_line": 441,
      "comment": "\n     * @param fmap points to the index of the starting point of a\n     *        permutation inside the block of data in the current\n     *        partially sorted order\n     * @param eclass points from the index of a character inside the\n     *        block to the first index in fmap that contains the\n     *        bucket of its suffix that is sorted in this step.\n     * @param loSt lower boundary of the fmap-interval to be sorted \n     * @param hiSt upper boundary of the fmap-interval to be sorted \n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 46)",
        "(line 348,col 9)-(line 348,col 19)",
        "(line 349,col 9)-(line 349,col 19)",
        "(line 350,col 9)-(line 350,col 32)",
        "(line 352,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "eclass"
      ],
      "begin_line": 446,
      "end_line": 446,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.getEclass()",
      "begin_line": 448,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 449,col 9)-(line 450,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.fallbackSort(int[], byte[], int)",
      "begin_line": 471,
      "end_line": 572,
      "comment": "\n     * @param fmap points to the index of the starting point of a\n     *        permutation inside the block of data in the current\n     *        partially sorted order\n     * @param block the original data\n     * @param nblock size of the block\n     * @param off offset of first byte to sort in block\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 40)",
        "(line 473,col 9)-(line 473,col 38)",
        "(line 474,col 9)-(line 474,col 21)",
        "(line 475,col 9)-(line 475,col 19)",
        "(line 476,col 9)-(line 476,col 41)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 497,col 9)",
        "(line 499,col 9)-(line 499,col 29)",
        "(line 500,col 9)-(line 500,col 48)",
        "(line 501,col 9)-(line 503,col 9)",
        "(line 512,col 9)-(line 515,col 9)",
        "(line 518,col 9)-(line 518,col 14)",
        "(line 519,col 9)-(line 571,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "INCS"
      ],
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * LBZ2: Knuth\u0027s increments seem to work better than Incerpi-Sedgewick here.\n     * Possibly because the number of elems to sort is usually small, typically\n     * \u0026lt;\u003d 20.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.mainSimpleSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int, int, int)",
      "begin_line": 595,
      "end_line": 774,
      "comment": "\n     * This is the most hammered method of this class.\n     *\n     * \u003cp\u003e\n     * This is the version using unrolled loops. Normally I never use such ones\n     * in Java code. The unrolling has shown a noticable performance improvement\n     * on JRE 1.4.2 (Linux i586 / HotSpot Client). Of course it depends on the\n     * JIT compiler of the vm.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 37)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 603,col 9)-(line 603,col 19)",
        "(line 604,col 9)-(line 606,col 9)",
        "(line 608,col 9)-(line 608,col 43)",
        "(line 609,col 9)-(line 609,col 46)",
        "(line 610,col 9)-(line 610,col 46)",
        "(line 611,col 9)-(line 611,col 45)",
        "(line 612,col 9)-(line 612,col 61)",
        "(line 613,col 9)-(line 613,col 51)",
        "(line 614,col 9)-(line 614,col 43)",
        "(line 619,col 9)-(line 770,col 9)",
        "(line 772,col 9)-(line 772,col 39)",
        "(line 773,col 9)-(line 773,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.vswap(int[], int, int, int)",
      "begin_line": 784,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 16)",
        "(line 786,col 9)-(line 790,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.med3(byte, byte, byte)",
      "begin_line": 793,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 794,col 9)-(line 795,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_THRESH"
      ],
      "begin_line": 798,
      "end_line": 798,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEPTH_THRESH"
      ],
      "begin_line": 799,
      "end_line": 799,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORK_FACTOR"
      ],
      "begin_line": 800,
      "end_line": 800,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.mainQSort3(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int, int, int)",
      "begin_line": 805,
      "end_line": 908,
      "comment": "\n     * Method \"mainQSort3\", file \"blocksort.c\", BZip2 1.0.2\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 45)",
        "(line 809,col 9)-(line 809,col 45)",
        "(line 810,col 9)-(line 810,col 45)",
        "(line 811,col 9)-(line 811,col 43)",
        "(line 812,col 9)-(line 812,col 46)",
        "(line 814,col 9)-(line 814,col 27)",
        "(line 815,col 9)-(line 815,col 27)",
        "(line 816,col 9)-(line 816,col 26)",
        "(line 818,col 9)-(line 907,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SETMASK"
      ],
      "begin_line": 910,
      "end_line": 910,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CLEARMASK"
      ],
      "begin_line": 911,
      "end_line": 911,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BlockSort.mainSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int)",
      "begin_line": 913,
      "end_line": 1077,
      "comment": "",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 62)",
        "(line 916,col 9)-(line 916,col 46)",
        "(line 917,col 9)-(line 917,col 56)",
        "(line 918,col 9)-(line 918,col 37)",
        "(line 919,col 9)-(line 919,col 46)",
        "(line 920,col 9)-(line 920,col 43)",
        "(line 921,col 9)-(line 921,col 46)",
        "(line 922,col 9)-(line 922,col 51)",
        "(line 923,col 9)-(line 923,col 61)",
        "(line 926,col 9)-(line 928,col 9)",
        "(line 935,col 9)-(line 937,col 9)",
        "(line 938,col 9)-(line 940,col 9)",
        "(line 941,col 9)-(line 941,col 41)",
        "(line 945,col 9)-(line 945,col 33)",
        "(line 946,col 9)-(line 950,col 9)",
        "(line 952,col 9)-(line 954,col 9)",
        "(line 956,col 9)-(line 956,col 29)",
        "(line 957,col 9)-(line 961,col 9)",
        "(line 963,col 9)-(line 963,col 93)",
        "(line 969,col 9)-(line 972,col 9)",
        "(line 974,col 9)-(line 991,col 9)",
        "(line 996,col 9)-(line 1076,col 9)"
      ]
    }
  ]
}