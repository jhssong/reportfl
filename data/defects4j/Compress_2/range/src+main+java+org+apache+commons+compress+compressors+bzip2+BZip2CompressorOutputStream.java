{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BZip2CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream",
        "org.apache.commons.compress.compressors.bzip2.BZip2Constants"
      ],
      "begin_line": 128,
      "end_line": 2053,
      "comment": "\n * An output stream that compresses into the BZip2 format (without the file\n * header chars) into another stream.\n *\n * \u003cp\u003e\n * The compression requires large amounts of memory. Thus you should call the\n * {@link #close() close()} method as soon as possible, to force\n * \u003ctt\u003eBZip2CompressorOutputStream\u003c/tt\u003e to release the allocated memory.\n * \u003c/p\u003e\n *\n * \u003cp\u003e You can shrink the amount of allocated memory and maybe raise\n * the compression speed by choosing a lower blocksize, which in turn\n * may cause a lower compression ratio. You can avoid unnecessary\n * memory allocation by avoiding using a blocksize which is bigger\n * than the size of the input.  \u003c/p\u003e\n *\n * \u003cp\u003e You can compute the memory usage for compressing by the\n * following formula: \u003c/p\u003e\n *\n * \u003cpre\u003e\n * \u0026lt;code\u0026gt;400k + (9 * blocksize)\u0026lt;/code\u0026gt;.\n * \u003c/pre\u003e\n *\n * \u003cp\u003e To get the memory required for decompression by {@link\n * BZip2CompressorInputStream} use \u003c/p\u003e\n *\n * \u003cpre\u003e\n * \u0026lt;code\u0026gt;65k + (5 * blocksize)\u0026lt;/code\u0026gt;.\n * \u003c/pre\u003e\n *\n * \u003ctable width\u003d\"100%\" border\u003d\"1\"\u003e\n * \u003ccolgroup\u003e \u003ccol width\u003d\"33%\" /\u003e \u003ccol width\u003d\"33%\" /\u003e \u003ccol width\u003d\"33%\" /\u003e\n * \u003c/colgroup\u003e\n * \u003ctr\u003e\n * \u003cth colspan\u003d\"3\"\u003eMemory usage by blocksize\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003cth align\u003d\"right\"\u003eBlocksize\u003c/th\u003e \u003cth align\u003d\"right\"\u003eCompression\u003cbr\u003e\n * memory usage\u003c/th\u003e \u003cth align\u003d\"right\"\u003eDecompression\u003cbr\u003e\n * memory usage\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e100k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1300k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e200k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2200k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e300k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3100k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e400k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4000k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e500k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4900k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e600k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e5800k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e700k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e6700k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e800k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e7600k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e900k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e8500k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003c/table\u003e\n *\n * \u003cp\u003e\n * For decompression \u003ctt\u003eBZip2CompressorInputStream\u003c/tt\u003e allocates less memory if the\n * bzipped input is smaller than one block.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * Instances of this class are not threadsafe.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * TODO: Update to BZip2 1.0.1\n * \u003c/p\u003e\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_BLOCKSIZE"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * The minimum supported blocksize \u003ctt\u003e \u003d\u003d 1\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_BLOCKSIZE"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * The maximum supported blocksize \u003ctt\u003e \u003d\u003d 9\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SETMASK"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CLEARMASK"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GREATER_ICOST"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LESSER_ICOST"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_THRESH"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEPTH_THRESH"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORK_FACTOR"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QSORT_STACK_SIZE"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003e If you are ever unlucky/improbable enough to get a stack\n     * overflow whilst sorting, increase the following constant and\n     * try again. In practice I have never seen the stack go above 27\n     * elems, so the following limit seems very generous.  \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INCS"
      ],
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Knuth\u0027s increments seem to work better than Incerpi-Sedgewick here.\n     * Possibly because the number of elems to sort is usually small, typically\n     * \u0026lt;\u003d 20.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbMakeCodeLengths(char[], int[], int, int)",
      "begin_line": 171,
      "end_line": 325,
      "comment": "\n     * This method is accessible by subclasses for historical\n     * purposes. If you don\u0027t know what it does then you don\u0027t need\n     * it.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 55)",
        "(line 178,col 9)-(line 178,col 57)",
        "(line 179,col 9)-(line 179,col 57)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbMakeCodeLengths(byte[], int[], org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int)",
      "begin_line": 327,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 36)",
        "(line 335,col 9)-(line 335,col 40)",
        "(line 336,col 9)-(line 336,col 40)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 342,col 9)-(line 475,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 481,
      "end_line": 481,
      "comment": "\n     * Index of the last char in the block, so the block size \u003d\u003d last + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": "\n     * Index in fmap[] of original string after sorting.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize100k"
      ],
      "begin_line": 492,
      "end_line": 492,
      "comment": "\n     * Always: in the range 0 .. 9. The current block size is 100000 * this\n     * number.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockRandomised"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsBuff"
      ],
      "begin_line": 496,
      "end_line": 496,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsLive"
      ],
      "begin_line": 497,
      "end_line": 497,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 498,
      "end_line": 498,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nInUse"
      ],
      "begin_line": 500,
      "end_line": 500,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nMTF"
      ],
      "begin_line": 502,
      "end_line": 502,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "workDone"
      ],
      "begin_line": 508,
      "end_line": 508,
      "comment": "\n     * Used when sorting. If too many long comparisons happen, we stop sorting,\n     * randomise the block slightly, and try again.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "workLimit"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstAttempt"
      ],
      "begin_line": 510,
      "end_line": 510,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentChar"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runLength"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockCRC"
      ],
      "begin_line": 515,
      "end_line": 515,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "combinedCRC"
      ],
      "begin_line": 516,
      "end_line": 516,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowableBlockSize"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": "\n     * All memory intensive stuff.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 524,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize(long)",
      "begin_line": 538,
      "end_line": 541,
      "comment": "\n     * Chooses a blocksize based on the given length of the data to compress.\n     *\n     * @return The blocksize, between {@link #MIN_BLOCKSIZE} and\n     *         {@link #MAX_BLOCKSIZE} both inclusive. For a negative\n     *         \u003ctt\u003einputLength\u003c/tt\u003e this method returns \u003ctt\u003eMAX_BLOCKSIZE\u003c/tt\u003e\n     *         always.\n     *\n     * @param inputLength\n     *            The length of the data which will be compressed by\n     *            \u003ctt\u003eCBZip2OutputStream\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 540,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 560,
      "end_line": 563,
      "comment": "\n     * Constructs a new \u003ctt\u003eCBZip2OutputStream\u003c/tt\u003e with a blocksize of 900k.\n     *\n     * \u003cp\u003e\n     * \u003cb\u003eAttention: \u003c/b\u003eThe caller is resonsible to write the two BZip2 magic\n     * bytes \u003ctt\u003e\"BZ\"\u003c/tt\u003e to the specified stream prior to calling this\n     * constructor.\n     * \u003c/p\u003e\n     *\n     * @param out *\n     *            the destination stream.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream, int)",
      "begin_line": 590,
      "end_line": 607,
      "comment": "\n     * Constructs a new \u003ctt\u003eCBZip2OutputStream\u003c/tt\u003e with specified blocksize.\n     *\n     * \u003cp\u003e\n     * \u003cb\u003eAttention: \u003c/b\u003eThe caller is resonsible to write the two BZip2 magic\n     * bytes \u003ctt\u003e\"BZ\"\u003c/tt\u003e to the specified stream prior to calling this\n     * constructor.\n     * \u003c/p\u003e\n     *\n     *\n     * @param out\n     *            the destination stream.\n     * @param blockSize\n     *            the blockSize as 100k units.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003e(blockSize \u003c 1) || (blockSize \u003e 9)\u003c/code\u003e.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     *\n     * @see #MIN_BLOCKSIZE\n     * @see #MAX_BLOCKSIZE\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 16)",
        "(line 595,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 39)",
        "(line 605,col 9)-(line 605,col 23)",
        "(line 606,col 9)-(line 606,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(int)",
      "begin_line": 609,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 614,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.writeRun()",
      "begin_line": 617,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 41)",
        "(line 620,col 9)-(line 668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finalize()",
      "begin_line": 674,
      "end_line": 677,
      "comment": "\n     * Overriden to close the stream.\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 17)",
        "(line 676,col 9)-(line 676,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finish()",
      "begin_line": 680,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 681,col 9)-(line 693,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.close()",
      "begin_line": 696,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 697,col 9)-(line 701,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.flush()",
      "begin_line": 704,
      "end_line": 709,
      "comment": "",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 42)",
        "(line 706,col 9)-(line 708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.init()",
      "begin_line": 711,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 49)",
        "(line 722,col 9)-(line 722,col 24)",
        "(line 723,col 9)-(line 723,col 45)",
        "(line 725,col 9)-(line 725,col 29)",
        "(line 726,col 9)-(line 726,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.initBlock()",
      "begin_line": 729,
      "end_line": 742,
      "comment": "",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 33)",
        "(line 732,col 9)-(line 732,col 23)",
        "(line 735,col 9)-(line 735,col 42)",
        "(line 736,col 9)-(line 738,col 9)",
        "(line 741,col 9)-(line 741,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endBlock()",
      "begin_line": 744,
      "end_line": 787,
      "comment": "",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 47)",
        "(line 746,col 9)-(line 746,col 79)",
        "(line 747,col 9)-(line 747,col 42)",
        "(line 750,col 9)-(line 752,col 9)",
        "(line 755,col 9)-(line 755,col 20)",
        "(line 768,col 9)-(line 768,col 25)",
        "(line 769,col 9)-(line 769,col 25)",
        "(line 770,col 9)-(line 770,col 25)",
        "(line 771,col 9)-(line 771,col 25)",
        "(line 772,col 9)-(line 772,col 25)",
        "(line 773,col 9)-(line 773,col 25)",
        "(line 776,col 9)-(line 776,col 32)",
        "(line 779,col 9)-(line 783,col 9)",
        "(line 786,col 9)-(line 786,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endCompression()",
      "begin_line": 789,
      "end_line": 805,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 25)",
        "(line 797,col 9)-(line 797,col 25)",
        "(line 798,col 9)-(line 798,col 25)",
        "(line 799,col 9)-(line 799,col 25)",
        "(line 800,col 9)-(line 800,col 25)",
        "(line 801,col 9)-(line 801,col 25)",
        "(line 803,col 9)-(line 803,col 35)",
        "(line 804,col 9)-(line 804,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.getBlockSize()",
      "begin_line": 810,
      "end_line": 812,
      "comment": "\n     * Returns the blocksize parameter specified at construction time.\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 814,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 816,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 829,col 9)",
        "(line 831,col 9)-(line 833,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write0(int)",
      "begin_line": 836,
      "end_line": 855,
      "comment": "",
      "child_ranges": [
        "(line 837,col 9)-(line 854,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbAssignCodes(int[], byte[], int, int, int)",
      "begin_line": 857,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 20)",
        "(line 861,col 9)-(line 869,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsFinishedWithStream()",
      "begin_line": 872,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 873,col 9)-(line 878,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(int, int)",
      "begin_line": 881,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 48)",
        "(line 883,col 9)-(line 883,col 39)",
        "(line 884,col 9)-(line 884,col 39)",
        "(line 886,col 9)-(line 890,col 9)",
        "(line 892,col 9)-(line 892,col 68)",
        "(line 893,col 9)-(line 893,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(int)",
      "begin_line": 896,
      "end_line": 898,
      "comment": "",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutInt(int)",
      "begin_line": 900,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 33)",
        "(line 902,col 9)-(line 902,col 33)",
        "(line 903,col 9)-(line 903,col 32)",
        "(line 904,col 9)-(line 904,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues()",
      "begin_line": 907,
      "end_line": 948,
      "comment": "",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 57)",
        "(line 909,col 9)-(line 909,col 46)",
        "(line 911,col 9)-(line 916,col 9)",
        "(line 920,col 9)-(line 921,col 66)",
        "(line 924,col 9)-(line 924,col 43)",
        "(line 929,col 9)-(line 929,col 66)",
        "(line 932,col 9)-(line 932,col 44)",
        "(line 935,col 9)-(line 935,col 43)",
        "(line 938,col 9)-(line 938,col 25)",
        "(line 941,col 9)-(line 941,col 44)",
        "(line 944,col 9)-(line 944,col 43)",
        "(line 947,col 9)-(line 947,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues0(int, int)",
      "begin_line": 950,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 57)",
        "(line 952,col 9)-(line 952,col 48)",
        "(line 954,col 9)-(line 954,col 29)",
        "(line 955,col 9)-(line 955,col 19)",
        "(line 957,col 9)-(line 982,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues1(int, int)",
      "begin_line": 985,
      "end_line": 1101,
      "comment": "",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 42)",
        "(line 987,col 9)-(line 987,col 61)",
        "(line 988,col 9)-(line 988,col 57)",
        "(line 989,col 9)-(line 989,col 59)",
        "(line 990,col 9)-(line 990,col 46)",
        "(line 991,col 9)-(line 991,col 52)",
        "(line 992,col 9)-(line 992,col 58)",
        "(line 993,col 9)-(line 993,col 36)",
        "(line 994,col 9)-(line 994,col 36)",
        "(line 995,col 9)-(line 995,col 36)",
        "(line 996,col 9)-(line 996,col 36)",
        "(line 997,col 9)-(line 997,col 36)",
        "(line 998,col 9)-(line 998,col 36)",
        "(line 999,col 9)-(line 999,col 41)",
        "(line 1001,col 9)-(line 1001,col 27)",
        "(line 1003,col 9)-(line 1098,col 9)",
        "(line 1100,col 9)-(line 1100,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues2(int, int)",
      "begin_line": 1103,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 42)",
        "(line 1107,col 9)-(line 1107,col 51)",
        "(line 1109,col 9)-(line 1111,col 9)",
        "(line 1113,col 9)-(line 1127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues3(int, int)",
      "begin_line": 1130,
      "end_line": 1153,
      "comment": "",
      "child_ranges": [
        "(line 1131,col 9)-(line 1131,col 52)",
        "(line 1132,col 9)-(line 1132,col 51)",
        "(line 1134,col 9)-(line 1152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues4()",
      "begin_line": 1155,
      "end_line": 1197,
      "comment": "",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 48)",
        "(line 1157,col 9)-(line 1157,col 67)",
        "(line 1159,col 9)-(line 1167,col 9)",
        "(line 1169,col 9)-(line 1171,col 9)",
        "(line 1173,col 9)-(line 1173,col 48)",
        "(line 1174,col 9)-(line 1174,col 39)",
        "(line 1175,col 9)-(line 1175,col 39)",
        "(line 1177,col 9)-(line 1193,col 9)",
        "(line 1195,col 9)-(line 1195,col 35)",
        "(line 1196,col 9)-(line 1196,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues5(int, int)",
      "begin_line": 1199,
      "end_line": 1234,
      "comment": "",
      "child_ranges": [
        "(line 1201,col 9)-(line 1201,col 24)",
        "(line 1202,col 9)-(line 1202,col 28)",
        "(line 1204,col 9)-(line 1204,col 48)",
        "(line 1205,col 9)-(line 1205,col 57)",
        "(line 1207,col 9)-(line 1207,col 39)",
        "(line 1208,col 9)-(line 1208,col 39)",
        "(line 1210,col 9)-(line 1230,col 9)",
        "(line 1232,col 9)-(line 1232,col 35)",
        "(line 1233,col 9)-(line 1233,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues6(int, int)",
      "begin_line": 1236,
      "end_line": 1298,
      "comment": "",
      "child_ranges": [
        "(line 1238,col 9)-(line 1238,col 57)",
        "(line 1239,col 9)-(line 1239,col 48)",
        "(line 1241,col 9)-(line 1241,col 39)",
        "(line 1242,col 9)-(line 1242,col 39)",
        "(line 1244,col 9)-(line 1294,col 9)",
        "(line 1296,col 9)-(line 1296,col 35)",
        "(line 1297,col 9)-(line 1297,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues7(int)",
      "begin_line": 1300,
      "end_line": 1345,
      "comment": "",
      "child_ranges": [
        "(line 1301,col 9)-(line 1301,col 42)",
        "(line 1302,col 9)-(line 1302,col 58)",
        "(line 1303,col 9)-(line 1303,col 59)",
        "(line 1304,col 9)-(line 1304,col 48)",
        "(line 1305,col 9)-(line 1305,col 52)",
        "(line 1306,col 9)-(line 1306,col 46)",
        "(line 1307,col 9)-(line 1307,col 41)",
        "(line 1309,col 9)-(line 1309,col 23)",
        "(line 1311,col 9)-(line 1311,col 39)",
        "(line 1312,col 9)-(line 1312,col 39)",
        "(line 1314,col 9)-(line 1341,col 9)",
        "(line 1343,col 9)-(line 1343,col 35)",
        "(line 1344,col 9)-(line 1344,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.moveToFrontCodeAndSend()",
      "begin_line": 1347,
      "end_line": 1351,
      "comment": "",
      "child_ranges": [
        "(line 1348,col 9)-(line 1348,col 30)",
        "(line 1349,col 9)-(line 1349,col 28)",
        "(line 1350,col 9)-(line 1350,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainSimpleSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int, int)",
      "begin_line": 1363,
      "end_line": 1545,
      "comment": "\n     * This is the most hammered method of this class.\n     *\n     * \u003cp\u003e\n     * This is the version using unrolled loops. Normally I never use such ones\n     * in Java code. The unrolling has shown a noticable performance improvement\n     * on JRE 1.4.2 (Linux i586 / HotSpot Client). Of course it depends on the\n     * JIT compiler of the vm.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1365,col 9)-(line 1365,col 37)",
        "(line 1366,col 9)-(line 1368,col 9)",
        "(line 1370,col 9)-(line 1370,col 19)",
        "(line 1371,col 9)-(line 1373,col 9)",
        "(line 1375,col 9)-(line 1375,col 43)",
        "(line 1376,col 9)-(line 1376,col 52)",
        "(line 1377,col 9)-(line 1377,col 46)",
        "(line 1378,col 9)-(line 1378,col 41)",
        "(line 1379,col 9)-(line 1379,col 45)",
        "(line 1380,col 9)-(line 1380,col 61)",
        "(line 1381,col 9)-(line 1381,col 51)",
        "(line 1382,col 9)-(line 1382,col 43)",
        "(line 1387,col 9)-(line 1541,col 9)",
        "(line 1543,col 9)-(line 1543,col 39)",
        "(line 1544,col 9)-(line 1544,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.vswap(int[], int, int, int)",
      "begin_line": 1547,
      "end_line": 1554,
      "comment": "",
      "child_ranges": [
        "(line 1548,col 9)-(line 1548,col 16)",
        "(line 1549,col 9)-(line 1553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.med3(byte, byte, byte)",
      "begin_line": 1556,
      "end_line": 1559,
      "comment": "",
      "child_ranges": [
        "(line 1557,col 9)-(line 1558,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.blockSort()",
      "begin_line": 1561,
      "end_line": 1585,
      "comment": "",
      "child_ranges": [
        "(line 1562,col 9)-(line 1562,col 49)",
        "(line 1563,col 9)-(line 1563,col 26)",
        "(line 1564,col 9)-(line 1564,col 37)",
        "(line 1565,col 9)-(line 1565,col 33)",
        "(line 1566,col 9)-(line 1566,col 19)",
        "(line 1568,col 9)-(line 1573,col 9)",
        "(line 1575,col 9)-(line 1575,col 36)",
        "(line 1576,col 9)-(line 1576,col 26)",
        "(line 1577,col 9)-(line 1582,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainQSort3(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int, int)",
      "begin_line": 1590,
      "end_line": 1692,
      "comment": "\n     * Method \"mainQSort3\", file \"blocksort.c\", BZip2 1.0.2\n     ",
      "child_ranges": [
        "(line 1592,col 9)-(line 1592,col 51)",
        "(line 1593,col 9)-(line 1593,col 51)",
        "(line 1594,col 9)-(line 1594,col 51)",
        "(line 1595,col 9)-(line 1595,col 43)",
        "(line 1596,col 9)-(line 1596,col 46)",
        "(line 1598,col 9)-(line 1598,col 27)",
        "(line 1599,col 9)-(line 1599,col 27)",
        "(line 1600,col 9)-(line 1600,col 26)",
        "(line 1602,col 9)-(line 1691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainSort()",
      "begin_line": 1694,
      "end_line": 1857,
      "comment": "",
      "child_ranges": [
        "(line 1695,col 9)-(line 1695,col 42)",
        "(line 1696,col 9)-(line 1696,col 68)",
        "(line 1697,col 9)-(line 1697,col 52)",
        "(line 1698,col 9)-(line 1698,col 62)",
        "(line 1699,col 9)-(line 1699,col 43)",
        "(line 1700,col 9)-(line 1700,col 46)",
        "(line 1701,col 9)-(line 1701,col 43)",
        "(line 1702,col 9)-(line 1702,col 52)",
        "(line 1703,col 9)-(line 1703,col 41)",
        "(line 1704,col 9)-(line 1704,col 51)",
        "(line 1705,col 9)-(line 1705,col 61)",
        "(line 1708,col 9)-(line 1710,col 9)",
        "(line 1717,col 9)-(line 1719,col 9)",
        "(line 1720,col 9)-(line 1722,col 9)",
        "(line 1723,col 9)-(line 1723,col 41)",
        "(line 1727,col 9)-(line 1727,col 33)",
        "(line 1728,col 9)-(line 1732,col 9)",
        "(line 1734,col 9)-(line 1735,col 35)",
        "(line 1737,col 9)-(line 1737,col 29)",
        "(line 1738,col 9)-(line 1742,col 9)",
        "(line 1744,col 9)-(line 1744,col 93)",
        "(line 1750,col 9)-(line 1753,col 9)",
        "(line 1755,col 9)-(line 1772,col 9)",
        "(line 1777,col 9)-(line 1856,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.randomiseBlock()",
      "begin_line": 1859,
      "end_line": 1885,
      "comment": "",
      "child_ranges": [
        "(line 1860,col 9)-(line 1860,col 48)",
        "(line 1861,col 9)-(line 1861,col 45)",
        "(line 1862,col 9)-(line 1862,col 41)",
        "(line 1864,col 9)-(line 1865,col 29)",
        "(line 1867,col 9)-(line 1867,col 23)",
        "(line 1868,col 9)-(line 1868,col 22)",
        "(line 1869,col 9)-(line 1882,col 9)",
        "(line 1884,col 9)-(line 1884,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.generateMTFValues()",
      "begin_line": 1887,
      "end_line": 1988,
      "comment": "",
      "child_ranges": [
        "(line 1888,col 9)-(line 1888,col 41)",
        "(line 1889,col 9)-(line 1889,col 42)",
        "(line 1890,col 9)-(line 1890,col 49)",
        "(line 1891,col 9)-(line 1891,col 46)",
        "(line 1892,col 9)-(line 1892,col 43)",
        "(line 1893,col 9)-(line 1893,col 46)",
        "(line 1894,col 9)-(line 1894,col 49)",
        "(line 1895,col 9)-(line 1895,col 56)",
        "(line 1896,col 9)-(line 1896,col 58)",
        "(line 1899,col 9)-(line 1899,col 29)",
        "(line 1900,col 9)-(line 1905,col 9)",
        "(line 1906,col 9)-(line 1906,col 35)",
        "(line 1908,col 9)-(line 1908,col 41)",
        "(line 1910,col 9)-(line 1912,col 9)",
        "(line 1914,col 9)-(line 1916,col 9)",
        "(line 1918,col 9)-(line 1918,col 19)",
        "(line 1919,col 9)-(line 1919,col 22)",
        "(line 1921,col 9)-(line 1962,col 9)",
        "(line 1964,col 9)-(line 1983,col 9)",
        "(line 1985,col 9)-(line 1985,col 31)",
        "(line 1986,col 9)-(line 1986,col 23)",
        "(line 1987,col 9)-(line 1987,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 1990,
      "end_line": 2051,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 1993,
      "end_line": 1993,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unseqToSeq"
      ],
      "begin_line": 1994,
      "end_line": 1994,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mtfFreq"
      ],
      "begin_line": 1995,
      "end_line": 1995,
      "comment": " 1032 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 1996,
      "end_line": 1996,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 1997,
      "end_line": 1997,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "generateMTFValues_yy"
      ],
      "begin_line": 1999,
      "end_line": 1999,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_len"
      ],
      "begin_line": 2000,
      "end_line": 2000,
      "comment": " 1548"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_rfreq"
      ],
      "begin_line": 2002,
      "end_line": 2002,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_fave"
      ],
      "begin_line": 2004,
      "end_line": 2004,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_cost"
      ],
      "begin_line": 2005,
      "end_line": 2005,
      "comment": " 12 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_code"
      ],
      "begin_line": 2006,
      "end_line": 2006,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues2_pos"
      ],
      "begin_line": 2008,
      "end_line": 2008,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sentMTFValues4_inUse16"
      ],
      "begin_line": 2009,
      "end_line": 2009,
      "comment": " 16 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_ll"
      ],
      "begin_line": 2011,
      "end_line": 2011,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_hh"
      ],
      "begin_line": 2012,
      "end_line": 2012,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_dd"
      ],
      "begin_line": 2013,
      "end_line": 2013,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_runningOrder"
      ],
      "begin_line": 2015,
      "end_line": 2015,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_copy"
      ],
      "begin_line": 2016,
      "end_line": 2016,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_bigDone"
      ],
      "begin_line": 2017,
      "end_line": 2017,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "heap"
      ],
      "begin_line": 2019,
      "end_line": 2019,
      "comment": " 1040 byte"
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 2020,
      "end_line": 2020,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 2021,
      "end_line": 2021,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ftab"
      ],
      "begin_line": 2023,
      "end_line": 2023,
      "comment": " 262148 byte"
    },
    {
      "type": "field",
      "varNames": [
        "block"
      ],
      "begin_line": 2027,
      "end_line": 2027,
      "comment": " 900021 byte"
    },
    {
      "type": "field",
      "varNames": [
        "fmap"
      ],
      "begin_line": 2028,
      "end_line": 2028,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sfmap"
      ],
      "begin_line": 2029,
      "end_line": 2029,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "quadrant"
      ],
      "begin_line": 2039,
      "end_line": 2039,
      "comment": "\n         * Array instance identical to sfmap, both are used only\n         * temporarily and indepently, so we do not need to allocate\n         * additional memory.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data.Data(int)",
      "begin_line": 2041,
      "end_line": 2049,
      "comment": "",
      "child_ranges": [
        "(line 2042,col 13)-(line 2042,col 20)",
        "(line 2044,col 13)-(line 2044,col 71)",
        "(line 2045,col 13)-(line 2045,col 65)",
        "(line 2046,col 13)-(line 2046,col 35)",
        "(line 2047,col 13)-(line 2047,col 41)",
        "(line 2048,col 13)-(line 2048,col 39)"
      ]
    }
  ]
}