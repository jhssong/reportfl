{
  "filepath": "/tmp/Compress-3b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java",
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
      "end_line": 1880,
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
        "SETMASK"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CLEARMASK"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GREATER_ICOST"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LESSER_ICOST"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_THRESH"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEPTH_THRESH"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORK_FACTOR"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QSORT_STACK_SIZE"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003e If you are ever unlucky/improbable enough to get a stack\n     * overflow whilst sorting, increase the following constant and\n     * try again. In practice I have never seen the stack go above 27\n     * elems, so the following limit seems very generous.  \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INCS"
      ],
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Knuth\u0027s increments seem to work better than Incerpi-Sedgewick here.\n     * Possibly because the number of elems to sort is usually small, typically\n     * \u0026lt;\u003d 20.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbMakeCodeLengths(byte[], int[], org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int)",
      "begin_line": 165,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 36)",
        "(line 173,col 9)-(line 173,col 40)",
        "(line 174,col 9)-(line 174,col 40)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 313,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": "\n     * Index of the last char in the block, so the block size \u003d\u003d last + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": "\n     * Index in fmap[] of original string after sorting.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize100k"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": "\n     * Always: in the range 0 .. 9. The current block size is 100000 * this\n     * number.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockRandomised"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsBuff"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsLive"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nInUse"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nMTF"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "workDone"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": "\n     * Used when sorting. If too many long comparisons happen, we stop sorting,\n     * randomise the block slightly, and try again.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "workLimit"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstAttempt"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentChar"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runLength"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockCRC"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "combinedCRC"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowableBlockSize"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": "\n     * All memory intensive stuff.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize(long)",
      "begin_line": 376,
      "end_line": 379,
      "comment": "\n     * Chooses a blocksize based on the given length of the data to compress.\n     *\n     * @return The blocksize, between {@link #MIN_BLOCKSIZE} and\n     *         {@link #MAX_BLOCKSIZE} both inclusive. For a negative\n     *         \u003ctt\u003einputLength\u003c/tt\u003e this method returns \u003ctt\u003eMAX_BLOCKSIZE\u003c/tt\u003e\n     *         always.\n     *\n     * @param inputLength\n     *            The length of the data which will be compressed by\n     *            \u003ctt\u003eCBZip2OutputStream\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 378,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 392,
      "end_line": 395,
      "comment": "\n     * Constructs a new \u003ctt\u003eCBZip2OutputStream\u003c/tt\u003e with a blocksize of 900k.\n     *\n     * @param out \n     *            the destination stream.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream, int)",
      "begin_line": 415,
      "end_line": 432,
      "comment": "\n     * Constructs a new \u003ctt\u003eCBZip2OutputStream\u003c/tt\u003e with specified blocksize.\n     *\n     * @param out\n     *            the destination stream.\n     * @param blockSize\n     *            the blockSize as 100k units.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003e(blockSize \u003c 1) || (blockSize \u003e 9)\u003c/code\u003e.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     *\n     * @see #MIN_BLOCKSIZE\n     * @see #MAX_BLOCKSIZE\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 16)",
        "(line 420,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 429,col 39)",
        "(line 430,col 9)-(line 430,col 23)",
        "(line 431,col 9)-(line 431,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(int)",
      "begin_line": 434,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 439,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.writeRun()",
      "begin_line": 442,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 41)",
        "(line 445,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finalize()",
      "begin_line": 499,
      "end_line": 502,
      "comment": "\n     * Overriden to close the stream.\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 17)",
        "(line 501,col 9)-(line 501,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finish()",
      "begin_line": 505,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.close()",
      "begin_line": 521,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.flush()",
      "begin_line": 529,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 42)",
        "(line 531,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.init()",
      "begin_line": 542,
      "end_line": 554,
      "comment": "\n     * Writes magic bytes like BZ on the first position of the stream\n     * and bytes indiciating the file-format, which is \n     * huffmanised, followed by a digit indicating blockSize100k.\n     * @throws IOException if the magic bytes could not been written\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 24)",
        "(line 544,col 9)-(line 544,col 24)",
        "(line 546,col 9)-(line 546,col 49)",
        "(line 549,col 9)-(line 549,col 24)",
        "(line 550,col 9)-(line 550,col 45)",
        "(line 552,col 9)-(line 552,col 29)",
        "(line 553,col 9)-(line 553,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.initBlock()",
      "begin_line": 556,
      "end_line": 569,
      "comment": "",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 33)",
        "(line 559,col 9)-(line 559,col 23)",
        "(line 562,col 9)-(line 562,col 42)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 568,col 9)-(line 568,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endBlock()",
      "begin_line": 571,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 47)",
        "(line 573,col 9)-(line 573,col 79)",
        "(line 574,col 9)-(line 574,col 42)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 582,col 9)-(line 582,col 20)",
        "(line 595,col 9)-(line 595,col 25)",
        "(line 596,col 9)-(line 596,col 25)",
        "(line 597,col 9)-(line 597,col 25)",
        "(line 598,col 9)-(line 598,col 25)",
        "(line 599,col 9)-(line 599,col 25)",
        "(line 600,col 9)-(line 600,col 25)",
        "(line 603,col 9)-(line 603,col 32)",
        "(line 606,col 9)-(line 610,col 9)",
        "(line 613,col 9)-(line 613,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endCompression()",
      "begin_line": 616,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 25)",
        "(line 624,col 9)-(line 624,col 25)",
        "(line 625,col 9)-(line 625,col 25)",
        "(line 626,col 9)-(line 626,col 25)",
        "(line 627,col 9)-(line 627,col 25)",
        "(line 628,col 9)-(line 628,col 25)",
        "(line 630,col 9)-(line 630,col 35)",
        "(line 631,col 9)-(line 631,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.getBlockSize()",
      "begin_line": 637,
      "end_line": 639,
      "comment": "\n     * Returns the blocksize parameter specified at construction time.\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 641,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 643,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 656,col 9)",
        "(line 658,col 9)-(line 660,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write0(int)",
      "begin_line": 663,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 681,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbAssignCodes(int[], byte[], int, int, int)",
      "begin_line": 684,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 20)",
        "(line 688,col 9)-(line 696,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsFinishedWithStream()",
      "begin_line": 699,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 700,col 9)-(line 705,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(int, int)",
      "begin_line": 708,
      "end_line": 721,
      "comment": "",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 48)",
        "(line 710,col 9)-(line 710,col 39)",
        "(line 711,col 9)-(line 711,col 39)",
        "(line 713,col 9)-(line 717,col 9)",
        "(line 719,col 9)-(line 719,col 68)",
        "(line 720,col 9)-(line 720,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(int)",
      "begin_line": 723,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutInt(int)",
      "begin_line": 727,
      "end_line": 732,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 33)",
        "(line 729,col 9)-(line 729,col 33)",
        "(line 730,col 9)-(line 730,col 32)",
        "(line 731,col 9)-(line 731,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues()",
      "begin_line": 734,
      "end_line": 775,
      "comment": "",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 57)",
        "(line 736,col 9)-(line 736,col 46)",
        "(line 738,col 9)-(line 743,col 9)",
        "(line 747,col 9)-(line 748,col 66)",
        "(line 751,col 9)-(line 751,col 43)",
        "(line 756,col 9)-(line 756,col 66)",
        "(line 759,col 9)-(line 759,col 44)",
        "(line 762,col 9)-(line 762,col 43)",
        "(line 765,col 9)-(line 765,col 25)",
        "(line 768,col 9)-(line 768,col 44)",
        "(line 771,col 9)-(line 771,col 43)",
        "(line 774,col 9)-(line 774,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues0(int, int)",
      "begin_line": 777,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 57)",
        "(line 779,col 9)-(line 779,col 48)",
        "(line 781,col 9)-(line 781,col 29)",
        "(line 782,col 9)-(line 782,col 19)",
        "(line 784,col 9)-(line 809,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues1(int, int)",
      "begin_line": 812,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 42)",
        "(line 814,col 9)-(line 814,col 61)",
        "(line 815,col 9)-(line 815,col 57)",
        "(line 816,col 9)-(line 816,col 59)",
        "(line 817,col 9)-(line 817,col 46)",
        "(line 818,col 9)-(line 818,col 52)",
        "(line 819,col 9)-(line 819,col 58)",
        "(line 820,col 9)-(line 820,col 36)",
        "(line 821,col 9)-(line 821,col 36)",
        "(line 822,col 9)-(line 822,col 36)",
        "(line 823,col 9)-(line 823,col 36)",
        "(line 824,col 9)-(line 824,col 36)",
        "(line 825,col 9)-(line 825,col 36)",
        "(line 826,col 9)-(line 826,col 41)",
        "(line 828,col 9)-(line 828,col 27)",
        "(line 830,col 9)-(line 925,col 9)",
        "(line 927,col 9)-(line 927,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues2(int, int)",
      "begin_line": 930,
      "end_line": 955,
      "comment": "",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 42)",
        "(line 934,col 9)-(line 934,col 51)",
        "(line 936,col 9)-(line 938,col 9)",
        "(line 940,col 9)-(line 954,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues3(int, int)",
      "begin_line": 957,
      "end_line": 980,
      "comment": "",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 52)",
        "(line 959,col 9)-(line 959,col 51)",
        "(line 961,col 9)-(line 979,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues4()",
      "begin_line": 982,
      "end_line": 1024,
      "comment": "",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 48)",
        "(line 984,col 9)-(line 984,col 67)",
        "(line 986,col 9)-(line 994,col 9)",
        "(line 996,col 9)-(line 998,col 9)",
        "(line 1000,col 9)-(line 1000,col 48)",
        "(line 1001,col 9)-(line 1001,col 39)",
        "(line 1002,col 9)-(line 1002,col 39)",
        "(line 1004,col 9)-(line 1020,col 9)",
        "(line 1022,col 9)-(line 1022,col 35)",
        "(line 1023,col 9)-(line 1023,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues5(int, int)",
      "begin_line": 1026,
      "end_line": 1061,
      "comment": "",
      "child_ranges": [
        "(line 1028,col 9)-(line 1028,col 24)",
        "(line 1029,col 9)-(line 1029,col 28)",
        "(line 1031,col 9)-(line 1031,col 48)",
        "(line 1032,col 9)-(line 1032,col 57)",
        "(line 1034,col 9)-(line 1034,col 39)",
        "(line 1035,col 9)-(line 1035,col 39)",
        "(line 1037,col 9)-(line 1057,col 9)",
        "(line 1059,col 9)-(line 1059,col 35)",
        "(line 1060,col 9)-(line 1060,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues6(int, int)",
      "begin_line": 1063,
      "end_line": 1125,
      "comment": "",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 57)",
        "(line 1066,col 9)-(line 1066,col 48)",
        "(line 1068,col 9)-(line 1068,col 39)",
        "(line 1069,col 9)-(line 1069,col 39)",
        "(line 1071,col 9)-(line 1121,col 9)",
        "(line 1123,col 9)-(line 1123,col 35)",
        "(line 1124,col 9)-(line 1124,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues7(int)",
      "begin_line": 1127,
      "end_line": 1172,
      "comment": "",
      "child_ranges": [
        "(line 1128,col 9)-(line 1128,col 42)",
        "(line 1129,col 9)-(line 1129,col 58)",
        "(line 1130,col 9)-(line 1130,col 59)",
        "(line 1131,col 9)-(line 1131,col 48)",
        "(line 1132,col 9)-(line 1132,col 52)",
        "(line 1133,col 9)-(line 1133,col 46)",
        "(line 1134,col 9)-(line 1134,col 41)",
        "(line 1136,col 9)-(line 1136,col 23)",
        "(line 1138,col 9)-(line 1138,col 39)",
        "(line 1139,col 9)-(line 1139,col 39)",
        "(line 1141,col 9)-(line 1168,col 9)",
        "(line 1170,col 9)-(line 1170,col 35)",
        "(line 1171,col 9)-(line 1171,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.moveToFrontCodeAndSend()",
      "begin_line": 1174,
      "end_line": 1178,
      "comment": "",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 30)",
        "(line 1176,col 9)-(line 1176,col 28)",
        "(line 1177,col 9)-(line 1177,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainSimpleSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int, int)",
      "begin_line": 1190,
      "end_line": 1372,
      "comment": "\n     * This is the most hammered method of this class.\n     *\n     * \u003cp\u003e\n     * This is the version using unrolled loops. Normally I never use such ones\n     * in Java code. The unrolling has shown a noticable performance improvement\n     * on JRE 1.4.2 (Linux i586 / HotSpot Client). Of course it depends on the\n     * JIT compiler of the vm.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1192,col 9)-(line 1192,col 37)",
        "(line 1193,col 9)-(line 1195,col 9)",
        "(line 1197,col 9)-(line 1197,col 19)",
        "(line 1198,col 9)-(line 1200,col 9)",
        "(line 1202,col 9)-(line 1202,col 43)",
        "(line 1203,col 9)-(line 1203,col 52)",
        "(line 1204,col 9)-(line 1204,col 46)",
        "(line 1205,col 9)-(line 1205,col 41)",
        "(line 1206,col 9)-(line 1206,col 45)",
        "(line 1207,col 9)-(line 1207,col 61)",
        "(line 1208,col 9)-(line 1208,col 51)",
        "(line 1209,col 9)-(line 1209,col 43)",
        "(line 1214,col 9)-(line 1368,col 9)",
        "(line 1370,col 9)-(line 1370,col 39)",
        "(line 1371,col 9)-(line 1371,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.vswap(int[], int, int, int)",
      "begin_line": 1374,
      "end_line": 1381,
      "comment": "",
      "child_ranges": [
        "(line 1375,col 9)-(line 1375,col 16)",
        "(line 1376,col 9)-(line 1380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.med3(byte, byte, byte)",
      "begin_line": 1383,
      "end_line": 1386,
      "comment": "",
      "child_ranges": [
        "(line 1384,col 9)-(line 1385,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.blockSort()",
      "begin_line": 1388,
      "end_line": 1412,
      "comment": "",
      "child_ranges": [
        "(line 1389,col 9)-(line 1389,col 49)",
        "(line 1390,col 9)-(line 1390,col 26)",
        "(line 1391,col 9)-(line 1391,col 37)",
        "(line 1392,col 9)-(line 1392,col 33)",
        "(line 1393,col 9)-(line 1393,col 19)",
        "(line 1395,col 9)-(line 1400,col 9)",
        "(line 1402,col 9)-(line 1402,col 36)",
        "(line 1403,col 9)-(line 1403,col 26)",
        "(line 1404,col 9)-(line 1409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainQSort3(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int, int)",
      "begin_line": 1417,
      "end_line": 1519,
      "comment": "\n     * Method \"mainQSort3\", file \"blocksort.c\", BZip2 1.0.2\n     ",
      "child_ranges": [
        "(line 1419,col 9)-(line 1419,col 51)",
        "(line 1420,col 9)-(line 1420,col 51)",
        "(line 1421,col 9)-(line 1421,col 51)",
        "(line 1422,col 9)-(line 1422,col 43)",
        "(line 1423,col 9)-(line 1423,col 46)",
        "(line 1425,col 9)-(line 1425,col 27)",
        "(line 1426,col 9)-(line 1426,col 27)",
        "(line 1427,col 9)-(line 1427,col 26)",
        "(line 1429,col 9)-(line 1518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainSort()",
      "begin_line": 1521,
      "end_line": 1684,
      "comment": "",
      "child_ranges": [
        "(line 1522,col 9)-(line 1522,col 42)",
        "(line 1523,col 9)-(line 1523,col 68)",
        "(line 1524,col 9)-(line 1524,col 52)",
        "(line 1525,col 9)-(line 1525,col 62)",
        "(line 1526,col 9)-(line 1526,col 43)",
        "(line 1527,col 9)-(line 1527,col 46)",
        "(line 1528,col 9)-(line 1528,col 43)",
        "(line 1529,col 9)-(line 1529,col 52)",
        "(line 1530,col 9)-(line 1530,col 41)",
        "(line 1531,col 9)-(line 1531,col 51)",
        "(line 1532,col 9)-(line 1532,col 61)",
        "(line 1535,col 9)-(line 1537,col 9)",
        "(line 1544,col 9)-(line 1546,col 9)",
        "(line 1547,col 9)-(line 1549,col 9)",
        "(line 1550,col 9)-(line 1550,col 41)",
        "(line 1554,col 9)-(line 1554,col 33)",
        "(line 1555,col 9)-(line 1559,col 9)",
        "(line 1561,col 9)-(line 1562,col 35)",
        "(line 1564,col 9)-(line 1564,col 29)",
        "(line 1565,col 9)-(line 1569,col 9)",
        "(line 1571,col 9)-(line 1571,col 93)",
        "(line 1577,col 9)-(line 1580,col 9)",
        "(line 1582,col 9)-(line 1599,col 9)",
        "(line 1604,col 9)-(line 1683,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.randomiseBlock()",
      "begin_line": 1686,
      "end_line": 1712,
      "comment": "",
      "child_ranges": [
        "(line 1687,col 9)-(line 1687,col 48)",
        "(line 1688,col 9)-(line 1688,col 45)",
        "(line 1689,col 9)-(line 1689,col 41)",
        "(line 1691,col 9)-(line 1692,col 29)",
        "(line 1694,col 9)-(line 1694,col 23)",
        "(line 1695,col 9)-(line 1695,col 22)",
        "(line 1696,col 9)-(line 1709,col 9)",
        "(line 1711,col 9)-(line 1711,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.generateMTFValues()",
      "begin_line": 1714,
      "end_line": 1815,
      "comment": "",
      "child_ranges": [
        "(line 1715,col 9)-(line 1715,col 41)",
        "(line 1716,col 9)-(line 1716,col 42)",
        "(line 1717,col 9)-(line 1717,col 49)",
        "(line 1718,col 9)-(line 1718,col 46)",
        "(line 1719,col 9)-(line 1719,col 43)",
        "(line 1720,col 9)-(line 1720,col 46)",
        "(line 1721,col 9)-(line 1721,col 49)",
        "(line 1722,col 9)-(line 1722,col 56)",
        "(line 1723,col 9)-(line 1723,col 58)",
        "(line 1726,col 9)-(line 1726,col 29)",
        "(line 1727,col 9)-(line 1732,col 9)",
        "(line 1733,col 9)-(line 1733,col 35)",
        "(line 1735,col 9)-(line 1735,col 41)",
        "(line 1737,col 9)-(line 1739,col 9)",
        "(line 1741,col 9)-(line 1743,col 9)",
        "(line 1745,col 9)-(line 1745,col 19)",
        "(line 1746,col 9)-(line 1746,col 22)",
        "(line 1748,col 9)-(line 1789,col 9)",
        "(line 1791,col 9)-(line 1810,col 9)",
        "(line 1812,col 9)-(line 1812,col 31)",
        "(line 1813,col 9)-(line 1813,col 23)",
        "(line 1814,col 9)-(line 1814,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 1817,
      "end_line": 1878,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 1820,
      "end_line": 1820,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unseqToSeq"
      ],
      "begin_line": 1821,
      "end_line": 1821,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mtfFreq"
      ],
      "begin_line": 1822,
      "end_line": 1822,
      "comment": " 1032 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 1823,
      "end_line": 1823,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 1824,
      "end_line": 1824,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "generateMTFValues_yy"
      ],
      "begin_line": 1826,
      "end_line": 1826,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_len"
      ],
      "begin_line": 1827,
      "end_line": 1827,
      "comment": " 1548"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_rfreq"
      ],
      "begin_line": 1829,
      "end_line": 1829,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_fave"
      ],
      "begin_line": 1831,
      "end_line": 1831,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_cost"
      ],
      "begin_line": 1832,
      "end_line": 1832,
      "comment": " 12 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_code"
      ],
      "begin_line": 1833,
      "end_line": 1833,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues2_pos"
      ],
      "begin_line": 1835,
      "end_line": 1835,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sentMTFValues4_inUse16"
      ],
      "begin_line": 1836,
      "end_line": 1836,
      "comment": " 16 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_ll"
      ],
      "begin_line": 1838,
      "end_line": 1838,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_hh"
      ],
      "begin_line": 1839,
      "end_line": 1839,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_dd"
      ],
      "begin_line": 1840,
      "end_line": 1840,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_runningOrder"
      ],
      "begin_line": 1842,
      "end_line": 1842,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_copy"
      ],
      "begin_line": 1843,
      "end_line": 1843,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_bigDone"
      ],
      "begin_line": 1844,
      "end_line": 1844,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "heap"
      ],
      "begin_line": 1846,
      "end_line": 1846,
      "comment": " 1040 byte"
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 1847,
      "end_line": 1847,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1848,
      "end_line": 1848,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ftab"
      ],
      "begin_line": 1850,
      "end_line": 1850,
      "comment": " 262148 byte"
    },
    {
      "type": "field",
      "varNames": [
        "block"
      ],
      "begin_line": 1854,
      "end_line": 1854,
      "comment": " 900021 byte"
    },
    {
      "type": "field",
      "varNames": [
        "fmap"
      ],
      "begin_line": 1855,
      "end_line": 1855,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sfmap"
      ],
      "begin_line": 1856,
      "end_line": 1856,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "quadrant"
      ],
      "begin_line": 1866,
      "end_line": 1866,
      "comment": "\n         * Array instance identical to sfmap, both are used only\n         * temporarily and indepently, so we do not need to allocate\n         * additional memory.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data.Data(int)",
      "begin_line": 1868,
      "end_line": 1876,
      "comment": "",
      "child_ranges": [
        "(line 1869,col 13)-(line 1869,col 20)",
        "(line 1871,col 13)-(line 1871,col 71)",
        "(line 1872,col 13)-(line 1872,col 65)",
        "(line 1873,col 13)-(line 1873,col 35)",
        "(line 1874,col 13)-(line 1874,col 41)",
        "(line 1875,col 13)-(line 1875,col 39)"
      ]
    }
  ]
}