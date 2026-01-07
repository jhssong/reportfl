{
  "filepath": "/tmp/Compress-7b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java",
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
      "end_line": 1881,
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
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 436,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.writeRun()",
      "begin_line": 443,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 41)",
        "(line 446,col 9)-(line 494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finalize()",
      "begin_line": 500,
      "end_line": 503,
      "comment": "\n     * Overriden to close the stream.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 17)",
        "(line 502,col 9)-(line 502,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finish()",
      "begin_line": 506,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 507,col 9)-(line 519,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.close()",
      "begin_line": 522,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 523,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.flush()",
      "begin_line": 530,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 42)",
        "(line 532,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.init()",
      "begin_line": 543,
      "end_line": 555,
      "comment": "\n     * Writes magic bytes like BZ on the first position of the stream\n     * and bytes indiciating the file-format, which is \n     * huffmanised, followed by a digit indicating blockSize100k.\n     * @throws IOException if the magic bytes could not been written\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 24)",
        "(line 545,col 9)-(line 545,col 24)",
        "(line 547,col 9)-(line 547,col 49)",
        "(line 550,col 9)-(line 550,col 24)",
        "(line 551,col 9)-(line 551,col 45)",
        "(line 553,col 9)-(line 553,col 29)",
        "(line 554,col 9)-(line 554,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.initBlock()",
      "begin_line": 557,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 33)",
        "(line 560,col 9)-(line 560,col 23)",
        "(line 563,col 9)-(line 563,col 42)",
        "(line 564,col 9)-(line 566,col 9)",
        "(line 569,col 9)-(line 569,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endBlock()",
      "begin_line": 572,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 47)",
        "(line 574,col 9)-(line 574,col 79)",
        "(line 575,col 9)-(line 575,col 42)",
        "(line 578,col 9)-(line 580,col 9)",
        "(line 583,col 9)-(line 583,col 20)",
        "(line 596,col 9)-(line 596,col 25)",
        "(line 597,col 9)-(line 597,col 25)",
        "(line 598,col 9)-(line 598,col 25)",
        "(line 599,col 9)-(line 599,col 25)",
        "(line 600,col 9)-(line 600,col 25)",
        "(line 601,col 9)-(line 601,col 25)",
        "(line 604,col 9)-(line 604,col 32)",
        "(line 607,col 9)-(line 611,col 9)",
        "(line 614,col 9)-(line 614,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endCompression()",
      "begin_line": 617,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 25)",
        "(line 625,col 9)-(line 625,col 25)",
        "(line 626,col 9)-(line 626,col 25)",
        "(line 627,col 9)-(line 627,col 25)",
        "(line 628,col 9)-(line 628,col 25)",
        "(line 629,col 9)-(line 629,col 25)",
        "(line 631,col 9)-(line 631,col 35)",
        "(line 632,col 9)-(line 632,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.getBlockSize()",
      "begin_line": 638,
      "end_line": 640,
      "comment": "\n     * Returns the blocksize parameter specified at construction time.\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 642,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 644,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 657,col 9)",
        "(line 659,col 9)-(line 661,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write0(int)",
      "begin_line": 664,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 682,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbAssignCodes(int[], byte[], int, int, int)",
      "begin_line": 685,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 20)",
        "(line 689,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsFinishedWithStream()",
      "begin_line": 700,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 701,col 9)-(line 706,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(int, int)",
      "begin_line": 709,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 48)",
        "(line 711,col 9)-(line 711,col 39)",
        "(line 712,col 9)-(line 712,col 39)",
        "(line 714,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 720,col 68)",
        "(line 721,col 9)-(line 721,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(int)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutInt(int)",
      "begin_line": 728,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 33)",
        "(line 730,col 9)-(line 730,col 33)",
        "(line 731,col 9)-(line 731,col 32)",
        "(line 732,col 9)-(line 732,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues()",
      "begin_line": 735,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 57)",
        "(line 737,col 9)-(line 737,col 46)",
        "(line 739,col 9)-(line 744,col 9)",
        "(line 748,col 9)-(line 749,col 66)",
        "(line 752,col 9)-(line 752,col 43)",
        "(line 757,col 9)-(line 757,col 66)",
        "(line 760,col 9)-(line 760,col 44)",
        "(line 763,col 9)-(line 763,col 43)",
        "(line 766,col 9)-(line 766,col 25)",
        "(line 769,col 9)-(line 769,col 44)",
        "(line 772,col 9)-(line 772,col 43)",
        "(line 775,col 9)-(line 775,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues0(int, int)",
      "begin_line": 778,
      "end_line": 811,
      "comment": "",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 57)",
        "(line 780,col 9)-(line 780,col 48)",
        "(line 782,col 9)-(line 782,col 29)",
        "(line 783,col 9)-(line 783,col 19)",
        "(line 785,col 9)-(line 810,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues1(int, int)",
      "begin_line": 813,
      "end_line": 929,
      "comment": "",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 42)",
        "(line 815,col 9)-(line 815,col 61)",
        "(line 816,col 9)-(line 816,col 57)",
        "(line 817,col 9)-(line 817,col 59)",
        "(line 818,col 9)-(line 818,col 46)",
        "(line 819,col 9)-(line 819,col 52)",
        "(line 820,col 9)-(line 820,col 58)",
        "(line 821,col 9)-(line 821,col 36)",
        "(line 822,col 9)-(line 822,col 36)",
        "(line 823,col 9)-(line 823,col 36)",
        "(line 824,col 9)-(line 824,col 36)",
        "(line 825,col 9)-(line 825,col 36)",
        "(line 826,col 9)-(line 826,col 36)",
        "(line 827,col 9)-(line 827,col 41)",
        "(line 829,col 9)-(line 829,col 27)",
        "(line 831,col 9)-(line 926,col 9)",
        "(line 928,col 9)-(line 928,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues2(int, int)",
      "begin_line": 931,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 42)",
        "(line 935,col 9)-(line 935,col 51)",
        "(line 937,col 9)-(line 939,col 9)",
        "(line 941,col 9)-(line 955,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues3(int, int)",
      "begin_line": 958,
      "end_line": 981,
      "comment": "",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 52)",
        "(line 960,col 9)-(line 960,col 51)",
        "(line 962,col 9)-(line 980,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues4()",
      "begin_line": 983,
      "end_line": 1025,
      "comment": "",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 48)",
        "(line 985,col 9)-(line 985,col 67)",
        "(line 987,col 9)-(line 995,col 9)",
        "(line 997,col 9)-(line 999,col 9)",
        "(line 1001,col 9)-(line 1001,col 48)",
        "(line 1002,col 9)-(line 1002,col 39)",
        "(line 1003,col 9)-(line 1003,col 39)",
        "(line 1005,col 9)-(line 1021,col 9)",
        "(line 1023,col 9)-(line 1023,col 35)",
        "(line 1024,col 9)-(line 1024,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues5(int, int)",
      "begin_line": 1027,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 24)",
        "(line 1030,col 9)-(line 1030,col 28)",
        "(line 1032,col 9)-(line 1032,col 48)",
        "(line 1033,col 9)-(line 1033,col 57)",
        "(line 1035,col 9)-(line 1035,col 39)",
        "(line 1036,col 9)-(line 1036,col 39)",
        "(line 1038,col 9)-(line 1058,col 9)",
        "(line 1060,col 9)-(line 1060,col 35)",
        "(line 1061,col 9)-(line 1061,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues6(int, int)",
      "begin_line": 1064,
      "end_line": 1126,
      "comment": "",
      "child_ranges": [
        "(line 1066,col 9)-(line 1066,col 57)",
        "(line 1067,col 9)-(line 1067,col 48)",
        "(line 1069,col 9)-(line 1069,col 39)",
        "(line 1070,col 9)-(line 1070,col 39)",
        "(line 1072,col 9)-(line 1122,col 9)",
        "(line 1124,col 9)-(line 1124,col 35)",
        "(line 1125,col 9)-(line 1125,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues7(int)",
      "begin_line": 1128,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1129,col 9)-(line 1129,col 42)",
        "(line 1130,col 9)-(line 1130,col 58)",
        "(line 1131,col 9)-(line 1131,col 59)",
        "(line 1132,col 9)-(line 1132,col 48)",
        "(line 1133,col 9)-(line 1133,col 52)",
        "(line 1134,col 9)-(line 1134,col 46)",
        "(line 1135,col 9)-(line 1135,col 41)",
        "(line 1137,col 9)-(line 1137,col 23)",
        "(line 1139,col 9)-(line 1139,col 39)",
        "(line 1140,col 9)-(line 1140,col 39)",
        "(line 1142,col 9)-(line 1169,col 9)",
        "(line 1171,col 9)-(line 1171,col 35)",
        "(line 1172,col 9)-(line 1172,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.moveToFrontCodeAndSend()",
      "begin_line": 1175,
      "end_line": 1179,
      "comment": "",
      "child_ranges": [
        "(line 1176,col 9)-(line 1176,col 30)",
        "(line 1177,col 9)-(line 1177,col 28)",
        "(line 1178,col 9)-(line 1178,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainSimpleSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int, int)",
      "begin_line": 1191,
      "end_line": 1373,
      "comment": "\n     * This is the most hammered method of this class.\n     *\n     * \u003cp\u003e\n     * This is the version using unrolled loops. Normally I never use such ones\n     * in Java code. The unrolling has shown a noticable performance improvement\n     * on JRE 1.4.2 (Linux i586 / HotSpot Client). Of course it depends on the\n     * JIT compiler of the vm.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1193,col 9)-(line 1193,col 37)",
        "(line 1194,col 9)-(line 1196,col 9)",
        "(line 1198,col 9)-(line 1198,col 19)",
        "(line 1199,col 9)-(line 1201,col 9)",
        "(line 1203,col 9)-(line 1203,col 43)",
        "(line 1204,col 9)-(line 1204,col 52)",
        "(line 1205,col 9)-(line 1205,col 46)",
        "(line 1206,col 9)-(line 1206,col 41)",
        "(line 1207,col 9)-(line 1207,col 45)",
        "(line 1208,col 9)-(line 1208,col 61)",
        "(line 1209,col 9)-(line 1209,col 51)",
        "(line 1210,col 9)-(line 1210,col 43)",
        "(line 1215,col 9)-(line 1369,col 9)",
        "(line 1371,col 9)-(line 1371,col 39)",
        "(line 1372,col 9)-(line 1372,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.vswap(int[], int, int, int)",
      "begin_line": 1375,
      "end_line": 1382,
      "comment": "",
      "child_ranges": [
        "(line 1376,col 9)-(line 1376,col 16)",
        "(line 1377,col 9)-(line 1381,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.med3(byte, byte, byte)",
      "begin_line": 1384,
      "end_line": 1387,
      "comment": "",
      "child_ranges": [
        "(line 1385,col 9)-(line 1386,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.blockSort()",
      "begin_line": 1389,
      "end_line": 1413,
      "comment": "",
      "child_ranges": [
        "(line 1390,col 9)-(line 1390,col 49)",
        "(line 1391,col 9)-(line 1391,col 26)",
        "(line 1392,col 9)-(line 1392,col 37)",
        "(line 1393,col 9)-(line 1393,col 33)",
        "(line 1394,col 9)-(line 1394,col 19)",
        "(line 1396,col 9)-(line 1401,col 9)",
        "(line 1403,col 9)-(line 1403,col 36)",
        "(line 1404,col 9)-(line 1404,col 26)",
        "(line 1405,col 9)-(line 1410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainQSort3(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int, int)",
      "begin_line": 1418,
      "end_line": 1520,
      "comment": "\n     * Method \"mainQSort3\", file \"blocksort.c\", BZip2 1.0.2\n     ",
      "child_ranges": [
        "(line 1420,col 9)-(line 1420,col 51)",
        "(line 1421,col 9)-(line 1421,col 51)",
        "(line 1422,col 9)-(line 1422,col 51)",
        "(line 1423,col 9)-(line 1423,col 43)",
        "(line 1424,col 9)-(line 1424,col 46)",
        "(line 1426,col 9)-(line 1426,col 27)",
        "(line 1427,col 9)-(line 1427,col 27)",
        "(line 1428,col 9)-(line 1428,col 26)",
        "(line 1430,col 9)-(line 1519,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainSort()",
      "begin_line": 1522,
      "end_line": 1685,
      "comment": "",
      "child_ranges": [
        "(line 1523,col 9)-(line 1523,col 42)",
        "(line 1524,col 9)-(line 1524,col 68)",
        "(line 1525,col 9)-(line 1525,col 52)",
        "(line 1526,col 9)-(line 1526,col 62)",
        "(line 1527,col 9)-(line 1527,col 43)",
        "(line 1528,col 9)-(line 1528,col 46)",
        "(line 1529,col 9)-(line 1529,col 43)",
        "(line 1530,col 9)-(line 1530,col 52)",
        "(line 1531,col 9)-(line 1531,col 41)",
        "(line 1532,col 9)-(line 1532,col 51)",
        "(line 1533,col 9)-(line 1533,col 61)",
        "(line 1536,col 9)-(line 1538,col 9)",
        "(line 1545,col 9)-(line 1547,col 9)",
        "(line 1548,col 9)-(line 1550,col 9)",
        "(line 1551,col 9)-(line 1551,col 41)",
        "(line 1555,col 9)-(line 1555,col 33)",
        "(line 1556,col 9)-(line 1560,col 9)",
        "(line 1562,col 9)-(line 1563,col 35)",
        "(line 1565,col 9)-(line 1565,col 29)",
        "(line 1566,col 9)-(line 1570,col 9)",
        "(line 1572,col 9)-(line 1572,col 93)",
        "(line 1578,col 9)-(line 1581,col 9)",
        "(line 1583,col 9)-(line 1600,col 9)",
        "(line 1605,col 9)-(line 1684,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.randomiseBlock()",
      "begin_line": 1687,
      "end_line": 1713,
      "comment": "",
      "child_ranges": [
        "(line 1688,col 9)-(line 1688,col 48)",
        "(line 1689,col 9)-(line 1689,col 45)",
        "(line 1690,col 9)-(line 1690,col 41)",
        "(line 1692,col 9)-(line 1693,col 29)",
        "(line 1695,col 9)-(line 1695,col 23)",
        "(line 1696,col 9)-(line 1696,col 22)",
        "(line 1697,col 9)-(line 1710,col 9)",
        "(line 1712,col 9)-(line 1712,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.generateMTFValues()",
      "begin_line": 1715,
      "end_line": 1816,
      "comment": "",
      "child_ranges": [
        "(line 1716,col 9)-(line 1716,col 41)",
        "(line 1717,col 9)-(line 1717,col 42)",
        "(line 1718,col 9)-(line 1718,col 49)",
        "(line 1719,col 9)-(line 1719,col 46)",
        "(line 1720,col 9)-(line 1720,col 43)",
        "(line 1721,col 9)-(line 1721,col 46)",
        "(line 1722,col 9)-(line 1722,col 49)",
        "(line 1723,col 9)-(line 1723,col 56)",
        "(line 1724,col 9)-(line 1724,col 58)",
        "(line 1727,col 9)-(line 1727,col 29)",
        "(line 1728,col 9)-(line 1733,col 9)",
        "(line 1734,col 9)-(line 1734,col 35)",
        "(line 1736,col 9)-(line 1736,col 41)",
        "(line 1738,col 9)-(line 1740,col 9)",
        "(line 1742,col 9)-(line 1744,col 9)",
        "(line 1746,col 9)-(line 1746,col 19)",
        "(line 1747,col 9)-(line 1747,col 22)",
        "(line 1749,col 9)-(line 1790,col 9)",
        "(line 1792,col 9)-(line 1811,col 9)",
        "(line 1813,col 9)-(line 1813,col 31)",
        "(line 1814,col 9)-(line 1814,col 23)",
        "(line 1815,col 9)-(line 1815,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 1818,
      "end_line": 1879,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 1821,
      "end_line": 1821,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unseqToSeq"
      ],
      "begin_line": 1822,
      "end_line": 1822,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mtfFreq"
      ],
      "begin_line": 1823,
      "end_line": 1823,
      "comment": " 1032 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 1824,
      "end_line": 1824,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 1825,
      "end_line": 1825,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "generateMTFValues_yy"
      ],
      "begin_line": 1827,
      "end_line": 1827,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_len"
      ],
      "begin_line": 1828,
      "end_line": 1828,
      "comment": " 1548"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_rfreq"
      ],
      "begin_line": 1830,
      "end_line": 1830,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_fave"
      ],
      "begin_line": 1832,
      "end_line": 1832,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_cost"
      ],
      "begin_line": 1833,
      "end_line": 1833,
      "comment": " 12 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_code"
      ],
      "begin_line": 1834,
      "end_line": 1834,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues2_pos"
      ],
      "begin_line": 1836,
      "end_line": 1836,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sentMTFValues4_inUse16"
      ],
      "begin_line": 1837,
      "end_line": 1837,
      "comment": " 16 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_ll"
      ],
      "begin_line": 1839,
      "end_line": 1839,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_hh"
      ],
      "begin_line": 1840,
      "end_line": 1840,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "stack_dd"
      ],
      "begin_line": 1841,
      "end_line": 1841,
      "comment": " 4000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_runningOrder"
      ],
      "begin_line": 1843,
      "end_line": 1843,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_copy"
      ],
      "begin_line": 1844,
      "end_line": 1844,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mainSort_bigDone"
      ],
      "begin_line": 1845,
      "end_line": 1845,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "heap"
      ],
      "begin_line": 1847,
      "end_line": 1847,
      "comment": " 1040 byte"
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 1848,
      "end_line": 1848,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1849,
      "end_line": 1849,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ftab"
      ],
      "begin_line": 1851,
      "end_line": 1851,
      "comment": " 262148 byte"
    },
    {
      "type": "field",
      "varNames": [
        "block"
      ],
      "begin_line": 1855,
      "end_line": 1855,
      "comment": " 900021 byte"
    },
    {
      "type": "field",
      "varNames": [
        "fmap"
      ],
      "begin_line": 1856,
      "end_line": 1856,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sfmap"
      ],
      "begin_line": 1857,
      "end_line": 1857,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "quadrant"
      ],
      "begin_line": 1867,
      "end_line": 1867,
      "comment": "\n         * Array instance identical to sfmap, both are used only\n         * temporarily and indepently, so we do not need to allocate\n         * additional memory.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data.Data(int)",
      "begin_line": 1869,
      "end_line": 1877,
      "comment": "",
      "child_ranges": [
        "(line 1870,col 13)-(line 1870,col 20)",
        "(line 1872,col 13)-(line 1872,col 71)",
        "(line 1873,col 13)-(line 1873,col 65)",
        "(line 1874,col 13)-(line 1874,col 35)",
        "(line 1875,col 13)-(line 1875,col 41)",
        "(line 1876,col 13)-(line 1876,col 39)"
      ]
    }
  ]
}