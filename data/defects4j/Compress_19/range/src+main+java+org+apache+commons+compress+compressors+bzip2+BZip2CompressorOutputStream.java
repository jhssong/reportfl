{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BZip2CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream",
        "org.apache.commons.compress.compressors.bzip2.BZip2Constants"
      ],
      "begin_line": 127,
      "end_line": 1340,
      "comment": "\n * An output stream that compresses into the BZip2 format into another stream.\n *\n * \u003cp\u003e\n * The compression requires large amounts of memory. Thus you should call the\n * {@link #close() close()} method as soon as possible, to force\n * \u003ctt\u003eBZip2CompressorOutputStream\u003c/tt\u003e to release the allocated memory.\n * \u003c/p\u003e\n *\n * \u003cp\u003e You can shrink the amount of allocated memory and maybe raise\n * the compression speed by choosing a lower blocksize, which in turn\n * may cause a lower compression ratio. You can avoid unnecessary\n * memory allocation by avoiding using a blocksize which is bigger\n * than the size of the input.  \u003c/p\u003e\n *\n * \u003cp\u003e You can compute the memory usage for compressing by the\n * following formula: \u003c/p\u003e\n *\n * \u003cpre\u003e\n * \u0026lt;code\u0026gt;400k + (9 * blocksize)\u0026lt;/code\u0026gt;.\n * \u003c/pre\u003e\n *\n * \u003cp\u003e To get the memory required for decompression by {@link\n * BZip2CompressorInputStream} use \u003c/p\u003e\n *\n * \u003cpre\u003e\n * \u0026lt;code\u0026gt;65k + (5 * blocksize)\u0026lt;/code\u0026gt;.\n * \u003c/pre\u003e\n *\n * \u003ctable width\u003d\"100%\" border\u003d\"1\"\u003e\n * \u003ccolgroup\u003e \u003ccol width\u003d\"33%\" /\u003e \u003ccol width\u003d\"33%\" /\u003e \u003ccol width\u003d\"33%\" /\u003e\n * \u003c/colgroup\u003e\n * \u003ctr\u003e\n * \u003cth colspan\u003d\"3\"\u003eMemory usage by blocksize\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003cth align\u003d\"right\"\u003eBlocksize\u003c/th\u003e \u003cth align\u003d\"right\"\u003eCompression\u003cbr\u003e\n * memory usage\u003c/th\u003e \u003cth align\u003d\"right\"\u003eDecompression\u003cbr\u003e\n * memory usage\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e100k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1300k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e200k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2200k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e300k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3100k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e400k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4000k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e500k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4900k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e600k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e5800k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e700k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e6700k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e800k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e7600k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e900k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e8500k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003c/table\u003e\n *\n * \u003cp\u003e\n * For decompression \u003ctt\u003eBZip2CompressorInputStream\u003c/tt\u003e allocates less memory if the\n * bzipped input is smaller than one block.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * Instances of this class are not threadsafe.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * TODO: Update to BZip2 1.0.1\n * \u003c/p\u003e\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_BLOCKSIZE"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * The minimum supported blocksize \u003ctt\u003e \u003d\u003d 1\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_BLOCKSIZE"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * The maximum supported blocksize \u003ctt\u003e \u003d\u003d 9\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GREATER_ICOST"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LESSER_ICOST"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbMakeCodeLengths(byte[], int[], org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int)",
      "begin_line": 143,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 36)",
        "(line 151,col 9)-(line 151,col 40)",
        "(line 152,col 9)-(line 152,col 40)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": "\n     * Index of the last char in the block, so the block size \u003d\u003d last + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize100k"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": "\n     * Always: in the range 0 .. 9. The current block size is 100000 * this\n     * number.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "bsBuff"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsLive"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nInUse"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nMTF"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentChar"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runLength"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockCRC"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "combinedCRC"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowableBlockSize"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": "\n     * All memory intensive stuff.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSorter"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize(long)",
      "begin_line": 340,
      "end_line": 343,
      "comment": "\n     * Chooses a blocksize based on the given length of the data to compress.\n     *\n     * @return The blocksize, between {@link #MIN_BLOCKSIZE} and\n     *         {@link #MAX_BLOCKSIZE} both inclusive. For a negative\n     *         \u003ctt\u003einputLength\u003c/tt\u003e this method returns \u003ctt\u003eMAX_BLOCKSIZE\u003c/tt\u003e\n     *         always.\n     *\n     * @param inputLength\n     *            The length of the data which will be compressed by\n     *            \u003ctt\u003eBZip2CompressorOutputStream\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 342,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\n     * Constructs a new \u003ctt\u003eBZip2CompressorOutputStream\u003c/tt\u003e with a blocksize of 900k.\n     *\n     * @param out \n     *            the destination stream.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream, int)",
      "begin_line": 379,
      "end_line": 399,
      "comment": "\n     * Constructs a new \u003ctt\u003eBZip2CompressorOutputStream\u003c/tt\u003e with specified blocksize.\n     *\n     * @param out\n     *            the destination stream.\n     * @param blockSize\n     *            the blockSize as 100k units.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003e(blockSize \u003c 1) || (blockSize \u003e 9)\u003c/code\u003e.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     *\n     * @see #MIN_BLOCKSIZE\n     * @see #MAX_BLOCKSIZE\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 16)",
        "(line 384,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 393,col 39)",
        "(line 394,col 9)-(line 394,col 23)",
        "(line 397,col 9)-(line 397,col 91)",
        "(line 398,col 9)-(line 398,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(int)",
      "begin_line": 402,
      "end_line": 409,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 404,col 9)-(line 408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.writeRun()",
      "begin_line": 424,
      "end_line": 476,
      "comment": "\n     * Writes the current byte to the buffer, run-length encoding it\n     * if it has been repeated at least four times (the first step\n     * RLEs sequences of four identical bytes).\n     *\n     * \u003cp\u003eFlushes the current block before writing data if it is\n     * full.\u003c/p\u003e\n     *\n     * \u003cp\u003e\"write to the buffer\" means adding to data.buffer starting\n     * two steps \"after\" this.last - initially starting at index 1\n     * (not 0) - and updating this.last to point to the last index\n     * written minus 1.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 41)",
        "(line 427,col 9)-(line 475,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finalize()",
      "begin_line": 481,
      "end_line": 485,
      "comment": "\n     * Overriden to close the stream.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 17)",
        "(line 484,col 9)-(line 484,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finish()",
      "begin_line": 488,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 489,col 9)-(line 502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.close()",
      "begin_line": 505,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 507,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.flush()",
      "begin_line": 514,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 42)",
        "(line 517,col 9)-(line 519,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.init()",
      "begin_line": 528,
      "end_line": 541,
      "comment": "\n     * Writes magic bytes like BZ on the first position of the stream\n     * and bytes indiciating the file-format, which is \n     * huffmanised, followed by a digit indicating blockSize100k.\n     * @throws IOException if the magic bytes could not been written\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 24)",
        "(line 530,col 9)-(line 530,col 24)",
        "(line 532,col 9)-(line 532,col 49)",
        "(line 533,col 9)-(line 533,col 52)",
        "(line 536,col 9)-(line 536,col 24)",
        "(line 537,col 9)-(line 537,col 45)",
        "(line 539,col 9)-(line 539,col 29)",
        "(line 540,col 9)-(line 540,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.initBlock()",
      "begin_line": 543,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 33)",
        "(line 546,col 9)-(line 546,col 23)",
        "(line 549,col 9)-(line 549,col 42)",
        "(line 550,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endBlock()",
      "begin_line": 556,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 47)",
        "(line 558,col 9)-(line 558,col 79)",
        "(line 559,col 9)-(line 559,col 42)",
        "(line 562,col 9)-(line 564,col 9)",
        "(line 567,col 9)-(line 567,col 20)",
        "(line 580,col 9)-(line 580,col 25)",
        "(line 581,col 9)-(line 581,col 25)",
        "(line 582,col 9)-(line 582,col 25)",
        "(line 583,col 9)-(line 583,col 25)",
        "(line 584,col 9)-(line 584,col 25)",
        "(line 585,col 9)-(line 585,col 25)",
        "(line 588,col 9)-(line 588,col 32)",
        "(line 591,col 9)-(line 591,col 18)",
        "(line 594,col 9)-(line 594,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endCompression()",
      "begin_line": 597,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 25)",
        "(line 605,col 9)-(line 605,col 25)",
        "(line 606,col 9)-(line 606,col 25)",
        "(line 607,col 9)-(line 607,col 25)",
        "(line 608,col 9)-(line 608,col 25)",
        "(line 609,col 9)-(line 609,col 25)",
        "(line 611,col 9)-(line 611,col 35)",
        "(line 612,col 9)-(line 612,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.getBlockSize()",
      "begin_line": 618,
      "end_line": 620,
      "comment": "\n     * Returns the blocksize parameter specified at construction time.\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 622,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 638,col 9)",
        "(line 640,col 9)-(line 642,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write0(int)",
      "begin_line": 649,
      "end_line": 668,
      "comment": "\n     * Keeps track of the last bytes written and implicitly performs\n     * run-length encoding as the first step of the bzip2 algorithm.\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbAssignCodes(int[], byte[], int, int, int)",
      "begin_line": 670,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 20)",
        "(line 674,col 9)-(line 682,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsFinishedWithStream()",
      "begin_line": 685,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(int, int)",
      "begin_line": 694,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 48)",
        "(line 696,col 9)-(line 696,col 39)",
        "(line 697,col 9)-(line 697,col 39)",
        "(line 699,col 9)-(line 703,col 9)",
        "(line 705,col 9)-(line 705,col 68)",
        "(line 706,col 9)-(line 706,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(int)",
      "begin_line": 709,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutInt(int)",
      "begin_line": 713,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 33)",
        "(line 715,col 9)-(line 715,col 33)",
        "(line 716,col 9)-(line 716,col 32)",
        "(line 717,col 9)-(line 717,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues()",
      "begin_line": 720,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 57)",
        "(line 722,col 9)-(line 722,col 46)",
        "(line 724,col 9)-(line 729,col 9)",
        "(line 733,col 9)-(line 734,col 66)",
        "(line 737,col 9)-(line 737,col 43)",
        "(line 742,col 9)-(line 742,col 66)",
        "(line 745,col 9)-(line 745,col 44)",
        "(line 748,col 9)-(line 748,col 43)",
        "(line 751,col 9)-(line 751,col 25)",
        "(line 754,col 9)-(line 754,col 44)",
        "(line 757,col 9)-(line 757,col 43)",
        "(line 760,col 9)-(line 760,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues0(int, int)",
      "begin_line": 763,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 57)",
        "(line 765,col 9)-(line 765,col 48)",
        "(line 767,col 9)-(line 767,col 29)",
        "(line 768,col 9)-(line 768,col 19)",
        "(line 770,col 9)-(line 795,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues1(int, int)",
      "begin_line": 798,
      "end_line": 914,
      "comment": "",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 42)",
        "(line 800,col 9)-(line 800,col 61)",
        "(line 801,col 9)-(line 801,col 57)",
        "(line 802,col 9)-(line 802,col 59)",
        "(line 803,col 9)-(line 803,col 46)",
        "(line 804,col 9)-(line 804,col 52)",
        "(line 805,col 9)-(line 805,col 58)",
        "(line 806,col 9)-(line 806,col 36)",
        "(line 807,col 9)-(line 807,col 36)",
        "(line 808,col 9)-(line 808,col 36)",
        "(line 809,col 9)-(line 809,col 36)",
        "(line 810,col 9)-(line 810,col 36)",
        "(line 811,col 9)-(line 811,col 36)",
        "(line 812,col 9)-(line 812,col 41)",
        "(line 814,col 9)-(line 814,col 27)",
        "(line 816,col 9)-(line 911,col 9)",
        "(line 913,col 9)-(line 913,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues2(int, int)",
      "begin_line": 916,
      "end_line": 941,
      "comment": "",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 42)",
        "(line 920,col 9)-(line 920,col 51)",
        "(line 922,col 9)-(line 924,col 9)",
        "(line 926,col 9)-(line 940,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues3(int, int)",
      "begin_line": 943,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 52)",
        "(line 945,col 9)-(line 945,col 51)",
        "(line 947,col 9)-(line 965,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues4()",
      "begin_line": 968,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 48)",
        "(line 970,col 9)-(line 970,col 67)",
        "(line 972,col 9)-(line 980,col 9)",
        "(line 982,col 9)-(line 984,col 9)",
        "(line 986,col 9)-(line 986,col 48)",
        "(line 987,col 9)-(line 987,col 39)",
        "(line 988,col 9)-(line 988,col 39)",
        "(line 990,col 9)-(line 1006,col 9)",
        "(line 1008,col 9)-(line 1008,col 35)",
        "(line 1009,col 9)-(line 1009,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues5(int, int)",
      "begin_line": 1012,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 24)",
        "(line 1015,col 9)-(line 1015,col 28)",
        "(line 1017,col 9)-(line 1017,col 48)",
        "(line 1018,col 9)-(line 1018,col 57)",
        "(line 1020,col 9)-(line 1020,col 39)",
        "(line 1021,col 9)-(line 1021,col 39)",
        "(line 1023,col 9)-(line 1043,col 9)",
        "(line 1045,col 9)-(line 1045,col 35)",
        "(line 1046,col 9)-(line 1046,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues6(int, int)",
      "begin_line": 1049,
      "end_line": 1111,
      "comment": "",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 57)",
        "(line 1052,col 9)-(line 1052,col 48)",
        "(line 1054,col 9)-(line 1054,col 39)",
        "(line 1055,col 9)-(line 1055,col 39)",
        "(line 1057,col 9)-(line 1107,col 9)",
        "(line 1109,col 9)-(line 1109,col 35)",
        "(line 1110,col 9)-(line 1110,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues7()",
      "begin_line": 1113,
      "end_line": 1158,
      "comment": "",
      "child_ranges": [
        "(line 1114,col 9)-(line 1114,col 42)",
        "(line 1115,col 9)-(line 1115,col 58)",
        "(line 1116,col 9)-(line 1116,col 59)",
        "(line 1117,col 9)-(line 1117,col 48)",
        "(line 1118,col 9)-(line 1118,col 52)",
        "(line 1119,col 9)-(line 1119,col 46)",
        "(line 1120,col 9)-(line 1120,col 41)",
        "(line 1122,col 9)-(line 1122,col 23)",
        "(line 1124,col 9)-(line 1124,col 39)",
        "(line 1125,col 9)-(line 1125,col 39)",
        "(line 1127,col 9)-(line 1154,col 9)",
        "(line 1156,col 9)-(line 1156,col 35)",
        "(line 1157,col 9)-(line 1157,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.moveToFrontCodeAndSend()",
      "begin_line": 1160,
      "end_line": 1164,
      "comment": "",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 35)",
        "(line 1162,col 9)-(line 1162,col 28)",
        "(line 1163,col 9)-(line 1163,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.blockSort()",
      "begin_line": 1166,
      "end_line": 1168,
      "comment": "",
      "child_ranges": [
        "(line 1167,col 9)-(line 1167,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.generateMTFValues()",
      "begin_line": 1177,
      "end_line": 1278,
      "comment": "\n     * Performs Move-To-Front on the Burrows-Wheeler transformed\n     * buffer, storing the MTFed data in data.sfmap in RUNA/RUNB\n     * run-length-encoded form.\n     *\n     * \u003cp\u003eKeeps track of byte frequencies in data.mtfFreq at the same time.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1178,col 9)-(line 1178,col 41)",
        "(line 1179,col 9)-(line 1179,col 42)",
        "(line 1180,col 9)-(line 1180,col 49)",
        "(line 1181,col 9)-(line 1181,col 46)",
        "(line 1182,col 9)-(line 1182,col 43)",
        "(line 1183,col 9)-(line 1183,col 46)",
        "(line 1184,col 9)-(line 1184,col 49)",
        "(line 1185,col 9)-(line 1185,col 56)",
        "(line 1186,col 9)-(line 1186,col 58)",
        "(line 1189,col 9)-(line 1189,col 29)",
        "(line 1190,col 9)-(line 1195,col 9)",
        "(line 1196,col 9)-(line 1196,col 35)",
        "(line 1198,col 9)-(line 1198,col 41)",
        "(line 1200,col 9)-(line 1202,col 9)",
        "(line 1204,col 9)-(line 1206,col 9)",
        "(line 1208,col 9)-(line 1208,col 19)",
        "(line 1209,col 9)-(line 1209,col 22)",
        "(line 1211,col 9)-(line 1252,col 9)",
        "(line 1254,col 9)-(line 1273,col 9)",
        "(line 1275,col 9)-(line 1275,col 31)",
        "(line 1276,col 9)-(line 1276,col 23)",
        "(line 1277,col 9)-(line 1277,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 1280,
      "end_line": 1338,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 1284,
      "end_line": 1284,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unseqToSeq"
      ],
      "begin_line": 1285,
      "end_line": 1285,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mtfFreq"
      ],
      "begin_line": 1286,
      "end_line": 1286,
      "comment": " 1032 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 1287,
      "end_line": 1287,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 1288,
      "end_line": 1288,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "generateMTFValues_yy"
      ],
      "begin_line": 1290,
      "end_line": 1290,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_len"
      ],
      "begin_line": 1291,
      "end_line": 1291,
      "comment": " 1548"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_rfreq"
      ],
      "begin_line": 1293,
      "end_line": 1293,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_fave"
      ],
      "begin_line": 1295,
      "end_line": 1295,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_cost"
      ],
      "begin_line": 1296,
      "end_line": 1296,
      "comment": " 12 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_code"
      ],
      "begin_line": 1297,
      "end_line": 1297,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues2_pos"
      ],
      "begin_line": 1299,
      "end_line": 1299,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sentMTFValues4_inUse16"
      ],
      "begin_line": 1300,
      "end_line": 1300,
      "comment": " 16 byte"
    },
    {
      "type": "field",
      "varNames": [
        "heap"
      ],
      "begin_line": 1302,
      "end_line": 1302,
      "comment": " 1040 byte"
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 1303,
      "end_line": 1303,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1304,
      "end_line": 1304,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "block"
      ],
      "begin_line": 1312,
      "end_line": 1312,
      "comment": " 900021 byte"
    },
    {
      "type": "field",
      "varNames": [
        "fmap"
      ],
      "begin_line": 1315,
      "end_line": 1315,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sfmap"
      ],
      "begin_line": 1316,
      "end_line": 1316,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 1327,
      "end_line": 1327,
      "comment": "\n         * Index of original line in Burrows-Wheeler table.\n         *\n         * \u003cp\u003eThis is the index in fmap that points to the last byte\n         * of the original data.\u003c/p\u003e\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data.Data(int)",
      "begin_line": 1329,
      "end_line": 1336,
      "comment": "",
      "child_ranges": [
        "(line 1330,col 13)-(line 1330,col 20)",
        "(line 1332,col 13)-(line 1332,col 71)",
        "(line 1333,col 13)-(line 1333,col 65)",
        "(line 1334,col 13)-(line 1334,col 35)",
        "(line 1335,col 13)-(line 1335,col 41)"
      ]
    }
  ]
}