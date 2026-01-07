{
  "filepath": "/tmp/Compress-10b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java",
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
      "end_line": 1886,
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
      "begin_line": 435,
      "end_line": 442,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 441,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.writeRun()",
      "begin_line": 444,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 41)",
        "(line 447,col 9)-(line 495,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finalize()",
      "begin_line": 501,
      "end_line": 505,
      "comment": "\n     * Overriden to close the stream.\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 17)",
        "(line 504,col 9)-(line 504,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finish()",
      "begin_line": 508,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 521,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.close()",
      "begin_line": 524,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 526,col 9)-(line 530,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.flush()",
      "begin_line": 533,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 42)",
        "(line 536,col 9)-(line 538,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.init()",
      "begin_line": 547,
      "end_line": 559,
      "comment": "\n     * Writes magic bytes like BZ on the first position of the stream\n     * and bytes indiciating the file-format, which is \n     * huffmanised, followed by a digit indicating blockSize100k.\n     * @throws IOException if the magic bytes could not been written\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 24)",
        "(line 549,col 9)-(line 549,col 24)",
        "(line 551,col 9)-(line 551,col 49)",
        "(line 554,col 9)-(line 554,col 24)",
        "(line 555,col 9)-(line 555,col 45)",
        "(line 557,col 9)-(line 557,col 29)",
        "(line 558,col 9)-(line 558,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.initBlock()",
      "begin_line": 561,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 33)",
        "(line 564,col 9)-(line 564,col 23)",
        "(line 567,col 9)-(line 567,col 42)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 573,col 9)-(line 573,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endBlock()",
      "begin_line": 576,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 47)",
        "(line 578,col 9)-(line 578,col 79)",
        "(line 579,col 9)-(line 579,col 42)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 587,col 9)-(line 587,col 20)",
        "(line 600,col 9)-(line 600,col 25)",
        "(line 601,col 9)-(line 601,col 25)",
        "(line 602,col 9)-(line 602,col 25)",
        "(line 603,col 9)-(line 603,col 25)",
        "(line 604,col 9)-(line 604,col 25)",
        "(line 605,col 9)-(line 605,col 25)",
        "(line 608,col 9)-(line 608,col 32)",
        "(line 611,col 9)-(line 615,col 9)",
        "(line 618,col 9)-(line 618,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endCompression()",
      "begin_line": 621,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 25)",
        "(line 629,col 9)-(line 629,col 25)",
        "(line 630,col 9)-(line 630,col 25)",
        "(line 631,col 9)-(line 631,col 25)",
        "(line 632,col 9)-(line 632,col 25)",
        "(line 633,col 9)-(line 633,col 25)",
        "(line 635,col 9)-(line 635,col 35)",
        "(line 636,col 9)-(line 636,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.getBlockSize()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\n     * Returns the blocksize parameter specified at construction time.\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 646,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 662,col 9)",
        "(line 664,col 9)-(line 666,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write0(int)",
      "begin_line": 669,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 670,col 9)-(line 687,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbAssignCodes(int[], byte[], int, int, int)",
      "begin_line": 690,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 20)",
        "(line 694,col 9)-(line 702,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsFinishedWithStream()",
      "begin_line": 705,
      "end_line": 712,
      "comment": "",
      "child_ranges": [
        "(line 706,col 9)-(line 711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(int, int)",
      "begin_line": 714,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 48)",
        "(line 716,col 9)-(line 716,col 39)",
        "(line 717,col 9)-(line 717,col 39)",
        "(line 719,col 9)-(line 723,col 9)",
        "(line 725,col 9)-(line 725,col 68)",
        "(line 726,col 9)-(line 726,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(int)",
      "begin_line": 729,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutInt(int)",
      "begin_line": 733,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 33)",
        "(line 735,col 9)-(line 735,col 33)",
        "(line 736,col 9)-(line 736,col 32)",
        "(line 737,col 9)-(line 737,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues()",
      "begin_line": 740,
      "end_line": 781,
      "comment": "",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 57)",
        "(line 742,col 9)-(line 742,col 46)",
        "(line 744,col 9)-(line 749,col 9)",
        "(line 753,col 9)-(line 754,col 66)",
        "(line 757,col 9)-(line 757,col 43)",
        "(line 762,col 9)-(line 762,col 66)",
        "(line 765,col 9)-(line 765,col 44)",
        "(line 768,col 9)-(line 768,col 43)",
        "(line 771,col 9)-(line 771,col 25)",
        "(line 774,col 9)-(line 774,col 44)",
        "(line 777,col 9)-(line 777,col 43)",
        "(line 780,col 9)-(line 780,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues0(int, int)",
      "begin_line": 783,
      "end_line": 816,
      "comment": "",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 57)",
        "(line 785,col 9)-(line 785,col 48)",
        "(line 787,col 9)-(line 787,col 29)",
        "(line 788,col 9)-(line 788,col 19)",
        "(line 790,col 9)-(line 815,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues1(int, int)",
      "begin_line": 818,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 42)",
        "(line 820,col 9)-(line 820,col 61)",
        "(line 821,col 9)-(line 821,col 57)",
        "(line 822,col 9)-(line 822,col 59)",
        "(line 823,col 9)-(line 823,col 46)",
        "(line 824,col 9)-(line 824,col 52)",
        "(line 825,col 9)-(line 825,col 58)",
        "(line 826,col 9)-(line 826,col 36)",
        "(line 827,col 9)-(line 827,col 36)",
        "(line 828,col 9)-(line 828,col 36)",
        "(line 829,col 9)-(line 829,col 36)",
        "(line 830,col 9)-(line 830,col 36)",
        "(line 831,col 9)-(line 831,col 36)",
        "(line 832,col 9)-(line 832,col 41)",
        "(line 834,col 9)-(line 834,col 27)",
        "(line 836,col 9)-(line 931,col 9)",
        "(line 933,col 9)-(line 933,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues2(int, int)",
      "begin_line": 936,
      "end_line": 961,
      "comment": "",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 42)",
        "(line 940,col 9)-(line 940,col 51)",
        "(line 942,col 9)-(line 944,col 9)",
        "(line 946,col 9)-(line 960,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues3(int, int)",
      "begin_line": 963,
      "end_line": 986,
      "comment": "",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 52)",
        "(line 965,col 9)-(line 965,col 51)",
        "(line 967,col 9)-(line 985,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues4()",
      "begin_line": 988,
      "end_line": 1030,
      "comment": "",
      "child_ranges": [
        "(line 989,col 9)-(line 989,col 48)",
        "(line 990,col 9)-(line 990,col 67)",
        "(line 992,col 9)-(line 1000,col 9)",
        "(line 1002,col 9)-(line 1004,col 9)",
        "(line 1006,col 9)-(line 1006,col 48)",
        "(line 1007,col 9)-(line 1007,col 39)",
        "(line 1008,col 9)-(line 1008,col 39)",
        "(line 1010,col 9)-(line 1026,col 9)",
        "(line 1028,col 9)-(line 1028,col 35)",
        "(line 1029,col 9)-(line 1029,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues5(int, int)",
      "begin_line": 1032,
      "end_line": 1067,
      "comment": "",
      "child_ranges": [
        "(line 1034,col 9)-(line 1034,col 24)",
        "(line 1035,col 9)-(line 1035,col 28)",
        "(line 1037,col 9)-(line 1037,col 48)",
        "(line 1038,col 9)-(line 1038,col 57)",
        "(line 1040,col 9)-(line 1040,col 39)",
        "(line 1041,col 9)-(line 1041,col 39)",
        "(line 1043,col 9)-(line 1063,col 9)",
        "(line 1065,col 9)-(line 1065,col 35)",
        "(line 1066,col 9)-(line 1066,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues6(int, int)",
      "begin_line": 1069,
      "end_line": 1131,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 57)",
        "(line 1072,col 9)-(line 1072,col 48)",
        "(line 1074,col 9)-(line 1074,col 39)",
        "(line 1075,col 9)-(line 1075,col 39)",
        "(line 1077,col 9)-(line 1127,col 9)",
        "(line 1129,col 9)-(line 1129,col 35)",
        "(line 1130,col 9)-(line 1130,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues7()",
      "begin_line": 1133,
      "end_line": 1178,
      "comment": "",
      "child_ranges": [
        "(line 1134,col 9)-(line 1134,col 42)",
        "(line 1135,col 9)-(line 1135,col 58)",
        "(line 1136,col 9)-(line 1136,col 59)",
        "(line 1137,col 9)-(line 1137,col 48)",
        "(line 1138,col 9)-(line 1138,col 52)",
        "(line 1139,col 9)-(line 1139,col 46)",
        "(line 1140,col 9)-(line 1140,col 41)",
        "(line 1142,col 9)-(line 1142,col 23)",
        "(line 1144,col 9)-(line 1144,col 39)",
        "(line 1145,col 9)-(line 1145,col 39)",
        "(line 1147,col 9)-(line 1174,col 9)",
        "(line 1176,col 9)-(line 1176,col 35)",
        "(line 1177,col 9)-(line 1177,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.moveToFrontCodeAndSend()",
      "begin_line": 1180,
      "end_line": 1184,
      "comment": "",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 30)",
        "(line 1182,col 9)-(line 1182,col 28)",
        "(line 1183,col 9)-(line 1183,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainSimpleSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int, int)",
      "begin_line": 1196,
      "end_line": 1378,
      "comment": "\n     * This is the most hammered method of this class.\n     *\n     * \u003cp\u003e\n     * This is the version using unrolled loops. Normally I never use such ones\n     * in Java code. The unrolling has shown a noticable performance improvement\n     * on JRE 1.4.2 (Linux i586 / HotSpot Client). Of course it depends on the\n     * JIT compiler of the vm.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 37)",
        "(line 1199,col 9)-(line 1201,col 9)",
        "(line 1203,col 9)-(line 1203,col 19)",
        "(line 1204,col 9)-(line 1206,col 9)",
        "(line 1208,col 9)-(line 1208,col 43)",
        "(line 1209,col 9)-(line 1209,col 52)",
        "(line 1210,col 9)-(line 1210,col 46)",
        "(line 1211,col 9)-(line 1211,col 41)",
        "(line 1212,col 9)-(line 1212,col 45)",
        "(line 1213,col 9)-(line 1213,col 61)",
        "(line 1214,col 9)-(line 1214,col 51)",
        "(line 1215,col 9)-(line 1215,col 43)",
        "(line 1220,col 9)-(line 1374,col 9)",
        "(line 1376,col 9)-(line 1376,col 39)",
        "(line 1377,col 9)-(line 1377,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.vswap(int[], int, int, int)",
      "begin_line": 1380,
      "end_line": 1387,
      "comment": "",
      "child_ranges": [
        "(line 1381,col 9)-(line 1381,col 16)",
        "(line 1382,col 9)-(line 1386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.med3(byte, byte, byte)",
      "begin_line": 1389,
      "end_line": 1392,
      "comment": "",
      "child_ranges": [
        "(line 1390,col 9)-(line 1391,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.blockSort()",
      "begin_line": 1394,
      "end_line": 1418,
      "comment": "",
      "child_ranges": [
        "(line 1395,col 9)-(line 1395,col 49)",
        "(line 1396,col 9)-(line 1396,col 26)",
        "(line 1397,col 9)-(line 1397,col 37)",
        "(line 1398,col 9)-(line 1398,col 33)",
        "(line 1399,col 9)-(line 1399,col 19)",
        "(line 1401,col 9)-(line 1406,col 9)",
        "(line 1408,col 9)-(line 1408,col 36)",
        "(line 1409,col 9)-(line 1409,col 26)",
        "(line 1410,col 9)-(line 1415,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainQSort3(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int, int)",
      "begin_line": 1423,
      "end_line": 1525,
      "comment": "\n     * Method \"mainQSort3\", file \"blocksort.c\", BZip2 1.0.2\n     ",
      "child_ranges": [
        "(line 1425,col 9)-(line 1425,col 51)",
        "(line 1426,col 9)-(line 1426,col 51)",
        "(line 1427,col 9)-(line 1427,col 51)",
        "(line 1428,col 9)-(line 1428,col 43)",
        "(line 1429,col 9)-(line 1429,col 46)",
        "(line 1431,col 9)-(line 1431,col 27)",
        "(line 1432,col 9)-(line 1432,col 27)",
        "(line 1433,col 9)-(line 1433,col 26)",
        "(line 1435,col 9)-(line 1524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainSort()",
      "begin_line": 1527,
      "end_line": 1690,
      "comment": "",
      "child_ranges": [
        "(line 1528,col 9)-(line 1528,col 42)",
        "(line 1529,col 9)-(line 1529,col 68)",
        "(line 1530,col 9)-(line 1530,col 52)",
        "(line 1531,col 9)-(line 1531,col 62)",
        "(line 1532,col 9)-(line 1532,col 43)",
        "(line 1533,col 9)-(line 1533,col 46)",
        "(line 1534,col 9)-(line 1534,col 43)",
        "(line 1535,col 9)-(line 1535,col 52)",
        "(line 1536,col 9)-(line 1536,col 41)",
        "(line 1537,col 9)-(line 1537,col 51)",
        "(line 1538,col 9)-(line 1538,col 61)",
        "(line 1541,col 9)-(line 1543,col 9)",
        "(line 1550,col 9)-(line 1552,col 9)",
        "(line 1553,col 9)-(line 1555,col 9)",
        "(line 1556,col 9)-(line 1556,col 41)",
        "(line 1560,col 9)-(line 1560,col 33)",
        "(line 1561,col 9)-(line 1565,col 9)",
        "(line 1567,col 9)-(line 1568,col 35)",
        "(line 1570,col 9)-(line 1570,col 29)",
        "(line 1571,col 9)-(line 1575,col 9)",
        "(line 1577,col 9)-(line 1577,col 93)",
        "(line 1583,col 9)-(line 1586,col 9)",
        "(line 1588,col 9)-(line 1605,col 9)",
        "(line 1610,col 9)-(line 1689,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.randomiseBlock()",
      "begin_line": 1692,
      "end_line": 1718,
      "comment": "",
      "child_ranges": [
        "(line 1693,col 9)-(line 1693,col 48)",
        "(line 1694,col 9)-(line 1694,col 45)",
        "(line 1695,col 9)-(line 1695,col 41)",
        "(line 1697,col 9)-(line 1698,col 29)",
        "(line 1700,col 9)-(line 1700,col 23)",
        "(line 1701,col 9)-(line 1701,col 22)",
        "(line 1702,col 9)-(line 1715,col 9)",
        "(line 1717,col 9)-(line 1717,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.generateMTFValues()",
      "begin_line": 1720,
      "end_line": 1821,
      "comment": "",
      "child_ranges": [
        "(line 1721,col 9)-(line 1721,col 41)",
        "(line 1722,col 9)-(line 1722,col 42)",
        "(line 1723,col 9)-(line 1723,col 49)",
        "(line 1724,col 9)-(line 1724,col 46)",
        "(line 1725,col 9)-(line 1725,col 43)",
        "(line 1726,col 9)-(line 1726,col 46)",
        "(line 1727,col 9)-(line 1727,col 49)",
        "(line 1728,col 9)-(line 1728,col 56)",
        "(line 1729,col 9)-(line 1729,col 58)",
        "(line 1732,col 9)-(line 1732,col 29)",
        "(line 1733,col 9)-(line 1738,col 9)",
        "(line 1739,col 9)-(line 1739,col 35)",
        "(line 1741,col 9)-(line 1741,col 41)",
        "(line 1743,col 9)-(line 1745,col 9)",
        "(line 1747,col 9)-(line 1749,col 9)",
        "(line 1751,col 9)-(line 1751,col 19)",
        "(line 1752,col 9)-(line 1752,col 22)",
        "(line 1754,col 9)-(line 1795,col 9)",
        "(line 1797,col 9)-(line 1816,col 9)",
        "(line 1818,col 9)-(line 1818,col 31)",
        "(line 1819,col 9)-(line 1819,col 23)",
        "(line 1820,col 9)-(line 1820,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 1823,
      "end_line": 1884,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 1826,
      "end_line": 1826,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unseqToSeq"
      ],
      "begin_line": 1827,
      "end_line": 1827,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mtfFreq"
      ],
      "begin_line": 1828,
      "end_line": 1828,
      "comment": " 1032 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 1829,
      "end_line": 1829,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 1830,
      "end_line": 1830,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "generateMTFValues_yy"
      ],
      "begin_line": 1832,
      "end_line": 1832,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_len"
      ],
      "begin_line": 1833,
      "end_line": 1833,
      "comment": " 1548"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_rfreq"
      ],
      "begin_line": 1835,
      "end_line": 1835,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_fave"
      ],
      "begin_line": 1837,
      "end_line": 1837,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_cost"
      ],
      "begin_line": 1838,
      "end_line": 1838,
      "comment": " 12 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_code"
      ],
      "begin_line": 1839,
      "end_line": 1839,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues2_pos"
      ],
      "begin_line": 1841,
      "end_line": 1841,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sentMTFValues4_inUse16"
      ],
      "begin_line": 1842,
      "end_line": 1842,
      "comment": " 16 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_ll"
      ],
      "begin_line": 1844,
      "end_line": 1844,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_hh"
      ],
      "begin_line": 1845,
      "end_line": 1845,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_dd"
      ],
      "begin_line": 1846,
      "end_line": 1846,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_runningOrder"
      ],
      "begin_line": 1848,
      "end_line": 1848,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_copy"
      ],
      "begin_line": 1849,
      "end_line": 1849,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_bigDone"
      ],
      "begin_line": 1850,
      "end_line": 1850,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "heap"
      ],
      "begin_line": 1852,
      "end_line": 1852,
      "comment": " 1040 byte"
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 1853,
      "end_line": 1853,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1854,
      "end_line": 1854,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ftab"
      ],
      "begin_line": 1856,
      "end_line": 1856,
      "comment": " 262148 byte"
    },
    {
      "type": "field",
      "varNames": [
        "block"
      ],
      "begin_line": 1860,
      "end_line": 1860,
      "comment": " 900021 byte"
    },
    {
      "type": "field",
      "varNames": [
        "fmap"
      ],
      "begin_line": 1861,
      "end_line": 1861,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sfmap"
      ],
      "begin_line": 1862,
      "end_line": 1862,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "quadrant"
      ],
      "begin_line": 1872,
      "end_line": 1872,
      "comment": "\n         * Array instance identical to sfmap, both are used only\n         * temporarily and indepently, so we do not need to allocate\n         * additional memory.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data.Data(int)",
      "begin_line": 1874,
      "end_line": 1882,
      "comment": "",
      "child_ranges": [
        "(line 1875,col 13)-(line 1875,col 20)",
        "(line 1877,col 13)-(line 1877,col 71)",
        "(line 1878,col 13)-(line 1878,col 65)",
        "(line 1879,col 13)-(line 1879,col 35)",
        "(line 1880,col 13)-(line 1880,col 41)",
        "(line 1881,col 13)-(line 1881,col 39)"
      ]
    }
  ]
}