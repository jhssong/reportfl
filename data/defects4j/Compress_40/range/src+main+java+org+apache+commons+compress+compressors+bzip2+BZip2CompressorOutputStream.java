{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BZip2CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream",
        "org.apache.commons.compress.compressors.bzip2.BZip2Constants"
      ],
      "begin_line": 125,
      "end_line": 1334,
      "comment": "\n * An output stream that compresses into the BZip2 format into another stream.\n *\n * \u003cp\u003e\n * The compression requires large amounts of memory. Thus you should call the\n * {@link #close() close()} method as soon as possible, to force\n * {@code BZip2CompressorOutputStream} to release the allocated memory.\n * \u003c/p\u003e\n *\n * \u003cp\u003e You can shrink the amount of allocated memory and maybe raise\n * the compression speed by choosing a lower blocksize, which in turn\n * may cause a lower compression ratio. You can avoid unnecessary\n * memory allocation by avoiding using a blocksize which is bigger\n * than the size of the input.  \u003c/p\u003e\n *\n * \u003cp\u003e You can compute the memory usage for compressing by the\n * following formula: \u003c/p\u003e\n *\n * \u003cpre\u003e\n * \u0026lt;code\u0026gt;400k + (9 * blocksize)\u0026lt;/code\u0026gt;.\n * \u003c/pre\u003e\n *\n * \u003cp\u003e To get the memory required for decompression by {@link\n * BZip2CompressorInputStream} use \u003c/p\u003e\n *\n * \u003cpre\u003e\n * \u0026lt;code\u0026gt;65k + (5 * blocksize)\u0026lt;/code\u0026gt;.\n * \u003c/pre\u003e\n *\n * \u003ctable width\u003d\"100%\" border\u003d\"1\" summary\u003d\"Memory usage by blocksize\"\u003e\n * \u003ctr\u003e\n * \u003cth colspan\u003d\"3\"\u003eMemory usage by blocksize\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003cth align\u003d\"right\"\u003eBlocksize\u003c/th\u003e \u003cth align\u003d\"right\"\u003eCompression\u003cbr\u003e\n * memory usage\u003c/th\u003e \u003cth align\u003d\"right\"\u003eDecompression\u003cbr\u003e\n * memory usage\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e100k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1300k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e200k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2200k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e300k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3100k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e400k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4000k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e500k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4900k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e600k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e5800k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e700k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e6700k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e800k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e7600k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e900k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e8500k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003c/table\u003e\n *\n * \u003cp\u003e\n * For decompression {@code BZip2CompressorInputStream} allocates less memory if the\n * bzipped input is smaller than one block.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * Instances of this class are not threadsafe.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * TODO: Update to BZip2 1.0.1\n * \u003c/p\u003e\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_BLOCKSIZE"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * The minimum supported blocksize {@code  \u003d\u003d 1}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_BLOCKSIZE"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * The maximum supported blocksize {@code  \u003d\u003d 9}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GREATER_ICOST"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LESSER_ICOST"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbMakeCodeLengths(byte[], int[], org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data, int, int)",
      "begin_line": 141,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 36)",
        "(line 149,col 9)-(line 149,col 40)",
        "(line 150,col 9)-(line 150,col 40)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 289,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * Index of the last char in the block, so the block size \u003d\u003d last + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize100k"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": "\n     * Always: in the range 0 .. 9. The current block size is 100000 * this\n     * number.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "bsBuff"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsLive"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nInUse"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nMTF"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentChar"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runLength"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockCRC"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "combinedCRC"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowableBlockSize"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": "\n     * All memory intensive stuff.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSorter"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize(long)",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\n     * Chooses a blocksize based on the given length of the data to compress.\n     *\n     * @return The blocksize, between {@link #MIN_BLOCKSIZE} and\n     *         {@link #MAX_BLOCKSIZE} both inclusive. For a negative\n     *         {@code inputLength} this method returns {@code MAX_BLOCKSIZE}\n     *         always.\n     *\n     * @param inputLength\n     *            The length of the data which will be compressed by\n     *            {@code BZip2CompressorOutputStream}.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 341,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 355,
      "end_line": 358,
      "comment": "\n     * Constructs a new {@code BZip2CompressorOutputStream} with a blocksize of 900k.\n     *\n     * @param out \n     *            the destination stream.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream, int)",
      "begin_line": 378,
      "end_line": 392,
      "comment": "\n     * Constructs a new {@code BZip2CompressorOutputStream} with specified blocksize.\n     *\n     * @param out\n     *            the destination stream.\n     * @param blockSize\n     *            the blockSize as 100k units.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003e(blockSize \u0026lt; 1) || (blockSize \u0026gt; 9)\u003c/code\u003e.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     *\n     * @see #MIN_BLOCKSIZE\n     * @see #MAX_BLOCKSIZE\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 386,col 39)",
        "(line 387,col 9)-(line 387,col 23)",
        "(line 390,col 9)-(line 390,col 91)",
        "(line 391,col 9)-(line 391,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(int)",
      "begin_line": 394,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.writeRun()",
      "begin_line": 416,
      "end_line": 468,
      "comment": "\n     * Writes the current byte to the buffer, run-length encoding it\n     * if it has been repeated at least four times (the first step\n     * RLEs sequences of four identical bytes).\n     *\n     * \u003cp\u003eFlushes the current block before writing data if it is\n     * full.\u003c/p\u003e\n     *\n     * \u003cp\u003e\"write to the buffer\" means adding to data.buffer starting\n     * two steps \"after\" this.last - initially starting at index 1\n     * (not 0) - and updating this.last to point to the last index\n     * written minus 1.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 41)",
        "(line 419,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finalize()",
      "begin_line": 473,
      "end_line": 479,
      "comment": "\n     * Overriden to warn about an unclosed stream.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finish()",
      "begin_line": 482,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 483,col 9)-(line 497,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.close()",
      "begin_line": 500,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 502,col 9)-(line 506,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.flush()",
      "begin_line": 509,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 48)",
        "(line 512,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.init()",
      "begin_line": 523,
      "end_line": 536,
      "comment": "\n     * Writes magic bytes like BZ on the first position of the stream\n     * and bytes indiciating the file-format, which is \n     * huffmanised, followed by a digit indicating blockSize100k.\n     * @throws IOException if the magic bytes could not been written\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 24)",
        "(line 525,col 9)-(line 525,col 24)",
        "(line 527,col 9)-(line 527,col 49)",
        "(line 528,col 9)-(line 528,col 52)",
        "(line 531,col 9)-(line 531,col 24)",
        "(line 532,col 9)-(line 532,col 45)",
        "(line 534,col 9)-(line 534,col 29)",
        "(line 535,col 9)-(line 535,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.initBlock()",
      "begin_line": 538,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 33)",
        "(line 541,col 9)-(line 541,col 23)",
        "(line 544,col 9)-(line 544,col 48)",
        "(line 545,col 9)-(line 547,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endBlock()",
      "begin_line": 551,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 47)",
        "(line 553,col 9)-(line 553,col 79)",
        "(line 554,col 9)-(line 554,col 42)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 562,col 9)-(line 562,col 20)",
        "(line 575,col 9)-(line 575,col 25)",
        "(line 576,col 9)-(line 576,col 25)",
        "(line 577,col 9)-(line 577,col 25)",
        "(line 578,col 9)-(line 578,col 25)",
        "(line 579,col 9)-(line 579,col 25)",
        "(line 580,col 9)-(line 580,col 25)",
        "(line 583,col 9)-(line 583,col 32)",
        "(line 586,col 9)-(line 586,col 18)",
        "(line 589,col 9)-(line 589,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endCompression()",
      "begin_line": 592,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 25)",
        "(line 600,col 9)-(line 600,col 25)",
        "(line 601,col 9)-(line 601,col 25)",
        "(line 602,col 9)-(line 602,col 25)",
        "(line 603,col 9)-(line 603,col 25)",
        "(line 604,col 9)-(line 604,col 25)",
        "(line 606,col 9)-(line 606,col 35)",
        "(line 607,col 9)-(line 607,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.getBlockSize()",
      "begin_line": 614,
      "end_line": 616,
      "comment": "\n     * Returns the blocksize parameter specified at construction time.\n     * @return the blocksize parameter specified at construction time\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 618,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 634,col 9)",
        "(line 636,col 9)-(line 638,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write0(int)",
      "begin_line": 645,
      "end_line": 664,
      "comment": "\n     * Keeps track of the last bytes written and implicitly performs\n     * run-length encoding as the first step of the bzip2 algorithm.\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 663,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbAssignCodes(int[], byte[], int, int, int)",
      "begin_line": 666,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 20)",
        "(line 670,col 9)-(line 678,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsFinishedWithStream()",
      "begin_line": 681,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 682,col 9)-(line 687,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(int, int)",
      "begin_line": 690,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 48)",
        "(line 692,col 9)-(line 692,col 39)",
        "(line 693,col 9)-(line 693,col 39)",
        "(line 695,col 9)-(line 699,col 9)",
        "(line 701,col 9)-(line 701,col 68)",
        "(line 702,col 9)-(line 702,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(int)",
      "begin_line": 705,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutInt(int)",
      "begin_line": 709,
      "end_line": 714,
      "comment": "",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 33)",
        "(line 711,col 9)-(line 711,col 33)",
        "(line 712,col 9)-(line 712,col 32)",
        "(line 713,col 9)-(line 713,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues()",
      "begin_line": 716,
      "end_line": 757,
      "comment": "",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 57)",
        "(line 718,col 9)-(line 718,col 46)",
        "(line 720,col 9)-(line 725,col 9)",
        "(line 729,col 9)-(line 730,col 66)",
        "(line 733,col 9)-(line 733,col 43)",
        "(line 738,col 9)-(line 738,col 66)",
        "(line 741,col 9)-(line 741,col 44)",
        "(line 744,col 9)-(line 744,col 43)",
        "(line 747,col 9)-(line 747,col 25)",
        "(line 750,col 9)-(line 750,col 44)",
        "(line 753,col 9)-(line 753,col 43)",
        "(line 756,col 9)-(line 756,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues0(int, int)",
      "begin_line": 759,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 57)",
        "(line 761,col 9)-(line 761,col 48)",
        "(line 763,col 9)-(line 763,col 29)",
        "(line 764,col 9)-(line 764,col 19)",
        "(line 766,col 9)-(line 791,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues1(int, int)",
      "begin_line": 794,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 42)",
        "(line 796,col 9)-(line 796,col 61)",
        "(line 797,col 9)-(line 797,col 57)",
        "(line 798,col 9)-(line 798,col 59)",
        "(line 799,col 9)-(line 799,col 46)",
        "(line 800,col 9)-(line 800,col 52)",
        "(line 801,col 9)-(line 801,col 58)",
        "(line 802,col 9)-(line 802,col 36)",
        "(line 803,col 9)-(line 803,col 36)",
        "(line 804,col 9)-(line 804,col 36)",
        "(line 805,col 9)-(line 805,col 36)",
        "(line 806,col 9)-(line 806,col 36)",
        "(line 807,col 9)-(line 807,col 36)",
        "(line 808,col 9)-(line 808,col 41)",
        "(line 810,col 9)-(line 810,col 27)",
        "(line 812,col 9)-(line 907,col 9)",
        "(line 909,col 9)-(line 909,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues2(int, int)",
      "begin_line": 912,
      "end_line": 937,
      "comment": "",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 42)",
        "(line 916,col 9)-(line 916,col 57)",
        "(line 918,col 9)-(line 920,col 9)",
        "(line 922,col 9)-(line 936,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues3(int, int)",
      "begin_line": 939,
      "end_line": 962,
      "comment": "",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 58)",
        "(line 941,col 9)-(line 941,col 57)",
        "(line 943,col 9)-(line 961,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues4()",
      "begin_line": 964,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 48)",
        "(line 966,col 9)-(line 966,col 67)",
        "(line 968,col 9)-(line 976,col 9)",
        "(line 978,col 9)-(line 980,col 9)",
        "(line 982,col 9)-(line 982,col 48)",
        "(line 983,col 9)-(line 983,col 39)",
        "(line 984,col 9)-(line 984,col 39)",
        "(line 986,col 9)-(line 1002,col 9)",
        "(line 1004,col 9)-(line 1004,col 35)",
        "(line 1005,col 9)-(line 1005,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues5(int, int)",
      "begin_line": 1008,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 24)",
        "(line 1011,col 9)-(line 1011,col 28)",
        "(line 1013,col 9)-(line 1013,col 48)",
        "(line 1014,col 9)-(line 1014,col 57)",
        "(line 1016,col 9)-(line 1016,col 39)",
        "(line 1017,col 9)-(line 1017,col 39)",
        "(line 1019,col 9)-(line 1039,col 9)",
        "(line 1041,col 9)-(line 1041,col 35)",
        "(line 1042,col 9)-(line 1042,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues6(int, int)",
      "begin_line": 1045,
      "end_line": 1107,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 57)",
        "(line 1048,col 9)-(line 1048,col 48)",
        "(line 1050,col 9)-(line 1050,col 39)",
        "(line 1051,col 9)-(line 1051,col 39)",
        "(line 1053,col 9)-(line 1103,col 9)",
        "(line 1105,col 9)-(line 1105,col 35)",
        "(line 1106,col 9)-(line 1106,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues7()",
      "begin_line": 1109,
      "end_line": 1154,
      "comment": "",
      "child_ranges": [
        "(line 1110,col 9)-(line 1110,col 42)",
        "(line 1111,col 9)-(line 1111,col 58)",
        "(line 1112,col 9)-(line 1112,col 59)",
        "(line 1113,col 9)-(line 1113,col 48)",
        "(line 1114,col 9)-(line 1114,col 52)",
        "(line 1115,col 9)-(line 1115,col 46)",
        "(line 1116,col 9)-(line 1116,col 41)",
        "(line 1118,col 9)-(line 1118,col 23)",
        "(line 1120,col 9)-(line 1120,col 39)",
        "(line 1121,col 9)-(line 1121,col 39)",
        "(line 1123,col 9)-(line 1150,col 9)",
        "(line 1152,col 9)-(line 1152,col 35)",
        "(line 1153,col 9)-(line 1153,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.moveToFrontCodeAndSend()",
      "begin_line": 1156,
      "end_line": 1160,
      "comment": "",
      "child_ranges": [
        "(line 1157,col 9)-(line 1157,col 35)",
        "(line 1158,col 9)-(line 1158,col 28)",
        "(line 1159,col 9)-(line 1159,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.blockSort()",
      "begin_line": 1162,
      "end_line": 1164,
      "comment": "",
      "child_ranges": [
        "(line 1163,col 9)-(line 1163,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.generateMTFValues()",
      "begin_line": 1173,
      "end_line": 1274,
      "comment": "\n     * Performs Move-To-Front on the Burrows-Wheeler transformed\n     * buffer, storing the MTFed data in data.sfmap in RUNA/RUNB\n     * run-length-encoded form.\n     *\n     * \u003cp\u003eKeeps track of byte frequencies in data.mtfFreq at the same time.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 41)",
        "(line 1175,col 9)-(line 1175,col 42)",
        "(line 1176,col 9)-(line 1176,col 49)",
        "(line 1177,col 9)-(line 1177,col 46)",
        "(line 1178,col 9)-(line 1178,col 43)",
        "(line 1179,col 9)-(line 1179,col 46)",
        "(line 1180,col 9)-(line 1180,col 49)",
        "(line 1181,col 9)-(line 1181,col 56)",
        "(line 1182,col 9)-(line 1182,col 58)",
        "(line 1185,col 9)-(line 1185,col 29)",
        "(line 1186,col 9)-(line 1191,col 9)",
        "(line 1192,col 9)-(line 1192,col 35)",
        "(line 1194,col 9)-(line 1194,col 41)",
        "(line 1196,col 9)-(line 1198,col 9)",
        "(line 1200,col 9)-(line 1202,col 9)",
        "(line 1204,col 9)-(line 1204,col 19)",
        "(line 1205,col 9)-(line 1205,col 22)",
        "(line 1207,col 9)-(line 1248,col 9)",
        "(line 1250,col 9)-(line 1269,col 9)",
        "(line 1271,col 9)-(line 1271,col 31)",
        "(line 1272,col 9)-(line 1272,col 23)",
        "(line 1273,col 9)-(line 1273,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1276,
      "end_line": 1332,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 1280,
      "end_line": 1280,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unseqToSeq"
      ],
      "begin_line": 1281,
      "end_line": 1281,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mtfFreq"
      ],
      "begin_line": 1282,
      "end_line": 1282,
      "comment": " 1032 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 1283,
      "end_line": 1283,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 1284,
      "end_line": 1284,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "generateMTFValues_yy"
      ],
      "begin_line": 1286,
      "end_line": 1286,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_len"
      ],
      "begin_line": 1287,
      "end_line": 1287,
      "comment": " 1548"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_rfreq"
      ],
      "begin_line": 1289,
      "end_line": 1289,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_fave"
      ],
      "begin_line": 1291,
      "end_line": 1291,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_cost"
      ],
      "begin_line": 1292,
      "end_line": 1292,
      "comment": " 12 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_code"
      ],
      "begin_line": 1293,
      "end_line": 1293,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues2_pos"
      ],
      "begin_line": 1295,
      "end_line": 1295,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sentMTFValues4_inUse16"
      ],
      "begin_line": 1296,
      "end_line": 1296,
      "comment": " 16 byte"
    },
    {
      "type": "field",
      "varNames": [
        "heap"
      ],
      "begin_line": 1298,
      "end_line": 1298,
      "comment": " 1040 byte"
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 1299,
      "end_line": 1299,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1300,
      "end_line": 1300,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "block"
      ],
      "begin_line": 1308,
      "end_line": 1308,
      "comment": " 900021 byte"
    },
    {
      "type": "field",
      "varNames": [
        "fmap"
      ],
      "begin_line": 1311,
      "end_line": 1311,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sfmap"
      ],
      "begin_line": 1312,
      "end_line": 1312,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 1323,
      "end_line": 1323,
      "comment": "\n         * Index of original line in Burrows-Wheeler table.\n         *\n         * \u003cp\u003eThis is the index in fmap that points to the last byte\n         * of the original data.\u003c/p\u003e\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data.Data(int)",
      "begin_line": 1325,
      "end_line": 1330,
      "comment": "",
      "child_ranges": [
        "(line 1326,col 13)-(line 1326,col 71)",
        "(line 1327,col 13)-(line 1327,col 65)",
        "(line 1328,col 13)-(line 1328,col 35)",
        "(line 1329,col 13)-(line 1329,col 41)"
      ]
    }
  ]
}