{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java",
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
      "end_line": 1331,
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
      "end_line": 393,
      "comment": "\n     * Constructs a new \u003ctt\u003eBZip2CompressorOutputStream\u003c/tt\u003e with specified blocksize.\n     *\n     * @param out\n     *            the destination stream.\n     * @param blockSize\n     *            the blockSize as 100k units.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003e(blockSize \u003c 1) || (blockSize \u003e 9)\u003c/code\u003e.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     *\n     * @see #MIN_BLOCKSIZE\n     * @see #MAX_BLOCKSIZE\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 387,col 9)-(line 387,col 39)",
        "(line 388,col 9)-(line 388,col 23)",
        "(line 391,col 9)-(line 391,col 91)",
        "(line 392,col 9)-(line 392,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(int)",
      "begin_line": 395,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.writeRun()",
      "begin_line": 417,
      "end_line": 469,
      "comment": "\n     * Writes the current byte to the buffer, run-length encoding it\n     * if it has been repeated at least four times (the first step\n     * RLEs sequences of four identical bytes).\n     *\n     * \u003cp\u003eFlushes the current block before writing data if it is\n     * full.\u003c/p\u003e\n     *\n     * \u003cp\u003e\"write to the buffer\" means adding to data.buffer starting\n     * two steps \"after\" this.last - initially starting at index 1\n     * (not 0) - and updating this.last to point to the last index\n     * written minus 1.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 41)",
        "(line 420,col 9)-(line 468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finalize()",
      "begin_line": 474,
      "end_line": 478,
      "comment": "\n     * Overriden to close the stream.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 17)",
        "(line 477,col 9)-(line 477,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finish()",
      "begin_line": 481,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 482,col 9)-(line 495,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.close()",
      "begin_line": 498,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 500,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.flush()",
      "begin_line": 507,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 42)",
        "(line 510,col 9)-(line 512,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.init()",
      "begin_line": 521,
      "end_line": 534,
      "comment": "\n     * Writes magic bytes like BZ on the first position of the stream\n     * and bytes indiciating the file-format, which is \n     * huffmanised, followed by a digit indicating blockSize100k.\n     * @throws IOException if the magic bytes could not been written\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 24)",
        "(line 523,col 9)-(line 523,col 24)",
        "(line 525,col 9)-(line 525,col 49)",
        "(line 526,col 9)-(line 526,col 52)",
        "(line 529,col 9)-(line 529,col 24)",
        "(line 530,col 9)-(line 530,col 45)",
        "(line 532,col 9)-(line 532,col 29)",
        "(line 533,col 9)-(line 533,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.initBlock()",
      "begin_line": 536,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 33)",
        "(line 539,col 9)-(line 539,col 23)",
        "(line 542,col 9)-(line 542,col 42)",
        "(line 543,col 9)-(line 545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endBlock()",
      "begin_line": 549,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 47)",
        "(line 551,col 9)-(line 551,col 79)",
        "(line 552,col 9)-(line 552,col 42)",
        "(line 555,col 9)-(line 557,col 9)",
        "(line 560,col 9)-(line 560,col 20)",
        "(line 573,col 9)-(line 573,col 25)",
        "(line 574,col 9)-(line 574,col 25)",
        "(line 575,col 9)-(line 575,col 25)",
        "(line 576,col 9)-(line 576,col 25)",
        "(line 577,col 9)-(line 577,col 25)",
        "(line 578,col 9)-(line 578,col 25)",
        "(line 581,col 9)-(line 581,col 32)",
        "(line 584,col 9)-(line 584,col 18)",
        "(line 587,col 9)-(line 587,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endCompression()",
      "begin_line": 590,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 25)",
        "(line 598,col 9)-(line 598,col 25)",
        "(line 599,col 9)-(line 599,col 25)",
        "(line 600,col 9)-(line 600,col 25)",
        "(line 601,col 9)-(line 601,col 25)",
        "(line 602,col 9)-(line 602,col 25)",
        "(line 604,col 9)-(line 604,col 35)",
        "(line 605,col 9)-(line 605,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.getBlockSize()",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\n     * Returns the blocksize parameter specified at construction time.\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 615,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write0(int)",
      "begin_line": 642,
      "end_line": 661,
      "comment": "\n     * Keeps track of the last bytes written and implicitly performs\n     * run-length encoding as the first step of the bzip2 algorithm.\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 660,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbAssignCodes(int[], byte[], int, int, int)",
      "begin_line": 663,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 20)",
        "(line 667,col 9)-(line 675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsFinishedWithStream()",
      "begin_line": 678,
      "end_line": 685,
      "comment": "",
      "child_ranges": [
        "(line 679,col 9)-(line 684,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(int, int)",
      "begin_line": 687,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 48)",
        "(line 689,col 9)-(line 689,col 39)",
        "(line 690,col 9)-(line 690,col 39)",
        "(line 692,col 9)-(line 696,col 9)",
        "(line 698,col 9)-(line 698,col 68)",
        "(line 699,col 9)-(line 699,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(int)",
      "begin_line": 702,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutInt(int)",
      "begin_line": 706,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 33)",
        "(line 708,col 9)-(line 708,col 33)",
        "(line 709,col 9)-(line 709,col 32)",
        "(line 710,col 9)-(line 710,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues()",
      "begin_line": 713,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 57)",
        "(line 715,col 9)-(line 715,col 46)",
        "(line 717,col 9)-(line 722,col 9)",
        "(line 726,col 9)-(line 727,col 66)",
        "(line 730,col 9)-(line 730,col 43)",
        "(line 735,col 9)-(line 735,col 66)",
        "(line 738,col 9)-(line 738,col 44)",
        "(line 741,col 9)-(line 741,col 43)",
        "(line 744,col 9)-(line 744,col 25)",
        "(line 747,col 9)-(line 747,col 44)",
        "(line 750,col 9)-(line 750,col 43)",
        "(line 753,col 9)-(line 753,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues0(int, int)",
      "begin_line": 756,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 57)",
        "(line 758,col 9)-(line 758,col 48)",
        "(line 760,col 9)-(line 760,col 29)",
        "(line 761,col 9)-(line 761,col 19)",
        "(line 763,col 9)-(line 788,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues1(int, int)",
      "begin_line": 791,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 42)",
        "(line 793,col 9)-(line 793,col 61)",
        "(line 794,col 9)-(line 794,col 57)",
        "(line 795,col 9)-(line 795,col 59)",
        "(line 796,col 9)-(line 796,col 46)",
        "(line 797,col 9)-(line 797,col 52)",
        "(line 798,col 9)-(line 798,col 58)",
        "(line 799,col 9)-(line 799,col 36)",
        "(line 800,col 9)-(line 800,col 36)",
        "(line 801,col 9)-(line 801,col 36)",
        "(line 802,col 9)-(line 802,col 36)",
        "(line 803,col 9)-(line 803,col 36)",
        "(line 804,col 9)-(line 804,col 36)",
        "(line 805,col 9)-(line 805,col 41)",
        "(line 807,col 9)-(line 807,col 27)",
        "(line 809,col 9)-(line 904,col 9)",
        "(line 906,col 9)-(line 906,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues2(int, int)",
      "begin_line": 909,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 42)",
        "(line 913,col 9)-(line 913,col 51)",
        "(line 915,col 9)-(line 917,col 9)",
        "(line 919,col 9)-(line 933,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues3(int, int)",
      "begin_line": 936,
      "end_line": 959,
      "comment": "",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 52)",
        "(line 938,col 9)-(line 938,col 51)",
        "(line 940,col 9)-(line 958,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues4()",
      "begin_line": 961,
      "end_line": 1003,
      "comment": "",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 48)",
        "(line 963,col 9)-(line 963,col 67)",
        "(line 965,col 9)-(line 973,col 9)",
        "(line 975,col 9)-(line 977,col 9)",
        "(line 979,col 9)-(line 979,col 48)",
        "(line 980,col 9)-(line 980,col 39)",
        "(line 981,col 9)-(line 981,col 39)",
        "(line 983,col 9)-(line 999,col 9)",
        "(line 1001,col 9)-(line 1001,col 35)",
        "(line 1002,col 9)-(line 1002,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues5(int, int)",
      "begin_line": 1005,
      "end_line": 1040,
      "comment": "",
      "child_ranges": [
        "(line 1007,col 9)-(line 1007,col 24)",
        "(line 1008,col 9)-(line 1008,col 28)",
        "(line 1010,col 9)-(line 1010,col 48)",
        "(line 1011,col 9)-(line 1011,col 57)",
        "(line 1013,col 9)-(line 1013,col 39)",
        "(line 1014,col 9)-(line 1014,col 39)",
        "(line 1016,col 9)-(line 1036,col 9)",
        "(line 1038,col 9)-(line 1038,col 35)",
        "(line 1039,col 9)-(line 1039,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues6(int, int)",
      "begin_line": 1042,
      "end_line": 1104,
      "comment": "",
      "child_ranges": [
        "(line 1044,col 9)-(line 1044,col 57)",
        "(line 1045,col 9)-(line 1045,col 48)",
        "(line 1047,col 9)-(line 1047,col 39)",
        "(line 1048,col 9)-(line 1048,col 39)",
        "(line 1050,col 9)-(line 1100,col 9)",
        "(line 1102,col 9)-(line 1102,col 35)",
        "(line 1103,col 9)-(line 1103,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues7()",
      "begin_line": 1106,
      "end_line": 1151,
      "comment": "",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 42)",
        "(line 1108,col 9)-(line 1108,col 58)",
        "(line 1109,col 9)-(line 1109,col 59)",
        "(line 1110,col 9)-(line 1110,col 48)",
        "(line 1111,col 9)-(line 1111,col 52)",
        "(line 1112,col 9)-(line 1112,col 46)",
        "(line 1113,col 9)-(line 1113,col 41)",
        "(line 1115,col 9)-(line 1115,col 23)",
        "(line 1117,col 9)-(line 1117,col 39)",
        "(line 1118,col 9)-(line 1118,col 39)",
        "(line 1120,col 9)-(line 1147,col 9)",
        "(line 1149,col 9)-(line 1149,col 35)",
        "(line 1150,col 9)-(line 1150,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.moveToFrontCodeAndSend()",
      "begin_line": 1153,
      "end_line": 1157,
      "comment": "",
      "child_ranges": [
        "(line 1154,col 9)-(line 1154,col 35)",
        "(line 1155,col 9)-(line 1155,col 28)",
        "(line 1156,col 9)-(line 1156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.blockSort()",
      "begin_line": 1159,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1160,col 9)-(line 1160,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.generateMTFValues()",
      "begin_line": 1170,
      "end_line": 1271,
      "comment": "\n     * Performs Move-To-Front on the Burrows-Wheeler transformed\n     * buffer, storing the MTFed data in data.sfmap in RUNA/RUNB\n     * run-length-encoded form.\n     *\n     * \u003cp\u003eKeeps track of byte frequencies in data.mtfFreq at the same time.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1171,col 9)-(line 1171,col 41)",
        "(line 1172,col 9)-(line 1172,col 42)",
        "(line 1173,col 9)-(line 1173,col 49)",
        "(line 1174,col 9)-(line 1174,col 46)",
        "(line 1175,col 9)-(line 1175,col 43)",
        "(line 1176,col 9)-(line 1176,col 46)",
        "(line 1177,col 9)-(line 1177,col 49)",
        "(line 1178,col 9)-(line 1178,col 56)",
        "(line 1179,col 9)-(line 1179,col 58)",
        "(line 1182,col 9)-(line 1182,col 29)",
        "(line 1183,col 9)-(line 1188,col 9)",
        "(line 1189,col 9)-(line 1189,col 35)",
        "(line 1191,col 9)-(line 1191,col 41)",
        "(line 1193,col 9)-(line 1195,col 9)",
        "(line 1197,col 9)-(line 1199,col 9)",
        "(line 1201,col 9)-(line 1201,col 19)",
        "(line 1202,col 9)-(line 1202,col 22)",
        "(line 1204,col 9)-(line 1245,col 9)",
        "(line 1247,col 9)-(line 1266,col 9)",
        "(line 1268,col 9)-(line 1268,col 31)",
        "(line 1269,col 9)-(line 1269,col 23)",
        "(line 1270,col 9)-(line 1270,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 1273,
      "end_line": 1329,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 1277,
      "end_line": 1277,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unseqToSeq"
      ],
      "begin_line": 1278,
      "end_line": 1278,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mtfFreq"
      ],
      "begin_line": 1279,
      "end_line": 1279,
      "comment": " 1032 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 1280,
      "end_line": 1280,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 1281,
      "end_line": 1281,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "generateMTFValues_yy"
      ],
      "begin_line": 1283,
      "end_line": 1283,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_len"
      ],
      "begin_line": 1284,
      "end_line": 1284,
      "comment": " 1548"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_rfreq"
      ],
      "begin_line": 1286,
      "end_line": 1286,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_fave"
      ],
      "begin_line": 1288,
      "end_line": 1288,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_cost"
      ],
      "begin_line": 1289,
      "end_line": 1289,
      "comment": " 12 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_code"
      ],
      "begin_line": 1290,
      "end_line": 1290,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues2_pos"
      ],
      "begin_line": 1292,
      "end_line": 1292,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sentMTFValues4_inUse16"
      ],
      "begin_line": 1293,
      "end_line": 1293,
      "comment": " 16 byte"
    },
    {
      "type": "field",
      "varNames": [
        "heap"
      ],
      "begin_line": 1295,
      "end_line": 1295,
      "comment": " 1040 byte"
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 1296,
      "end_line": 1296,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1297,
      "end_line": 1297,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "block"
      ],
      "begin_line": 1305,
      "end_line": 1305,
      "comment": " 900021 byte"
    },
    {
      "type": "field",
      "varNames": [
        "fmap"
      ],
      "begin_line": 1308,
      "end_line": 1308,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sfmap"
      ],
      "begin_line": 1309,
      "end_line": 1309,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 1320,
      "end_line": 1320,
      "comment": "\n         * Index of original line in Burrows-Wheeler table.\n         *\n         * \u003cp\u003eThis is the index in fmap that points to the last byte\n         * of the original data.\u003c/p\u003e\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data.Data(int)",
      "begin_line": 1322,
      "end_line": 1327,
      "comment": "",
      "child_ranges": [
        "(line 1323,col 13)-(line 1323,col 71)",
        "(line 1324,col 13)-(line 1324,col 65)",
        "(line 1325,col 13)-(line 1325,col 35)",
        "(line 1326,col 13)-(line 1326,col 41)"
      ]
    }
  ]
}