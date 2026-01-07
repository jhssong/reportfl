{
  "filepath": "/tmp/Compress-28b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java",
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
      "end_line": 1329,
      "comment": "\n * An output stream that compresses into the BZip2 format into another stream.\n *\n * \u003cp\u003e\n * The compression requires large amounts of memory. Thus you should call the\n * {@link #close() close()} method as soon as possible, to force\n * \u003ctt\u003eBZip2CompressorOutputStream\u003c/tt\u003e to release the allocated memory.\n * \u003c/p\u003e\n *\n * \u003cp\u003e You can shrink the amount of allocated memory and maybe raise\n * the compression speed by choosing a lower blocksize, which in turn\n * may cause a lower compression ratio. You can avoid unnecessary\n * memory allocation by avoiding using a blocksize which is bigger\n * than the size of the input.  \u003c/p\u003e\n *\n * \u003cp\u003e You can compute the memory usage for compressing by the\n * following formula: \u003c/p\u003e\n *\n * \u003cpre\u003e\n * \u0026lt;code\u0026gt;400k + (9 * blocksize)\u0026lt;/code\u0026gt;.\n * \u003c/pre\u003e\n *\n * \u003cp\u003e To get the memory required for decompression by {@link\n * BZip2CompressorInputStream} use \u003c/p\u003e\n *\n * \u003cpre\u003e\n * \u0026lt;code\u0026gt;65k + (5 * blocksize)\u0026lt;/code\u0026gt;.\n * \u003c/pre\u003e\n *\n * \u003ctable width\u003d\"100%\" border\u003d\"1\" summary\u003d\"Memory usage by blocksize\"\u003e\n * \u003ctr\u003e\n * \u003cth colspan\u003d\"3\"\u003eMemory usage by blocksize\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003cth align\u003d\"right\"\u003eBlocksize\u003c/th\u003e \u003cth align\u003d\"right\"\u003eCompression\u003cbr\u003e\n * memory usage\u003c/th\u003e \u003cth align\u003d\"right\"\u003eDecompression\u003cbr\u003e\n * memory usage\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e100k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1300k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e200k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2200k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e300k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3100k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e1565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e400k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4000k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e500k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4900k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e2565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e600k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e5800k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e700k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e6700k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e3565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e800k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e7600k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4065k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd align\u003d\"right\"\u003e900k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e8500k\u003c/td\u003e\n * \u003ctd align\u003d\"right\"\u003e4565k\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003c/table\u003e\n *\n * \u003cp\u003e\n * For decompression \u003ctt\u003eBZip2CompressorInputStream\u003c/tt\u003e allocates less memory if the\n * bzipped input is smaller than one block.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * Instances of this class are not threadsafe.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * TODO: Update to BZip2 1.0.1\n * \u003c/p\u003e\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_BLOCKSIZE"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * The minimum supported blocksize \u003ctt\u003e \u003d\u003d 1\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_BLOCKSIZE"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * The maximum supported blocksize \u003ctt\u003e \u003d\u003d 9\u003c/tt\u003e.\n     "
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
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize(long)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * Chooses a blocksize based on the given length of the data to compress.\n     *\n     * @return The blocksize, between {@link #MIN_BLOCKSIZE} and\n     *         {@link #MAX_BLOCKSIZE} both inclusive. For a negative\n     *         \u003ctt\u003einputLength\u003c/tt\u003e this method returns \u003ctt\u003eMAX_BLOCKSIZE\u003c/tt\u003e\n     *         always.\n     *\n     * @param inputLength\n     *            The length of the data which will be compressed by\n     *            \u003ctt\u003eBZip2CompressorOutputStream\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 340,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 354,
      "end_line": 357,
      "comment": "\n     * Constructs a new \u003ctt\u003eBZip2CompressorOutputStream\u003c/tt\u003e with a blocksize of 900k.\n     *\n     * @param out \n     *            the destination stream.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream, int)",
      "begin_line": 377,
      "end_line": 391,
      "comment": "\n     * Constructs a new \u003ctt\u003eBZip2CompressorOutputStream\u003c/tt\u003e with specified blocksize.\n     *\n     * @param out\n     *            the destination stream.\n     * @param blockSize\n     *            the blockSize as 100k units.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003e(blockSize \u0026lt; 1) || (blockSize \u0026gt; 9)\u003c/code\u003e.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     *\n     * @see #MIN_BLOCKSIZE\n     * @see #MAX_BLOCKSIZE\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 385,col 39)",
        "(line 386,col 9)-(line 386,col 23)",
        "(line 389,col 9)-(line 389,col 91)",
        "(line 390,col 9)-(line 390,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(int)",
      "begin_line": 393,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.writeRun()",
      "begin_line": 415,
      "end_line": 467,
      "comment": "\n     * Writes the current byte to the buffer, run-length encoding it\n     * if it has been repeated at least four times (the first step\n     * RLEs sequences of four identical bytes).\n     *\n     * \u003cp\u003eFlushes the current block before writing data if it is\n     * full.\u003c/p\u003e\n     *\n     * \u003cp\u003e\"write to the buffer\" means adding to data.buffer starting\n     * two steps \"after\" this.last - initially starting at index 1\n     * (not 0) - and updating this.last to point to the last index\n     * written minus 1.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 41)",
        "(line 418,col 9)-(line 466,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finalize()",
      "begin_line": 472,
      "end_line": 476,
      "comment": "\n     * Overriden to close the stream.\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 17)",
        "(line 475,col 9)-(line 475,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finish()",
      "begin_line": 479,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 480,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.close()",
      "begin_line": 496,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.flush()",
      "begin_line": 505,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 42)",
        "(line 508,col 9)-(line 510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.init()",
      "begin_line": 519,
      "end_line": 532,
      "comment": "\n     * Writes magic bytes like BZ on the first position of the stream\n     * and bytes indiciating the file-format, which is \n     * huffmanised, followed by a digit indicating blockSize100k.\n     * @throws IOException if the magic bytes could not been written\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 24)",
        "(line 521,col 9)-(line 521,col 24)",
        "(line 523,col 9)-(line 523,col 49)",
        "(line 524,col 9)-(line 524,col 52)",
        "(line 527,col 9)-(line 527,col 24)",
        "(line 528,col 9)-(line 528,col 45)",
        "(line 530,col 9)-(line 530,col 29)",
        "(line 531,col 9)-(line 531,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.initBlock()",
      "begin_line": 534,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 33)",
        "(line 537,col 9)-(line 537,col 23)",
        "(line 540,col 9)-(line 540,col 42)",
        "(line 541,col 9)-(line 543,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endBlock()",
      "begin_line": 547,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 47)",
        "(line 549,col 9)-(line 549,col 79)",
        "(line 550,col 9)-(line 550,col 42)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 558,col 9)-(line 558,col 20)",
        "(line 571,col 9)-(line 571,col 25)",
        "(line 572,col 9)-(line 572,col 25)",
        "(line 573,col 9)-(line 573,col 25)",
        "(line 574,col 9)-(line 574,col 25)",
        "(line 575,col 9)-(line 575,col 25)",
        "(line 576,col 9)-(line 576,col 25)",
        "(line 579,col 9)-(line 579,col 32)",
        "(line 582,col 9)-(line 582,col 18)",
        "(line 585,col 9)-(line 585,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endCompression()",
      "begin_line": 588,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 25)",
        "(line 596,col 9)-(line 596,col 25)",
        "(line 597,col 9)-(line 597,col 25)",
        "(line 598,col 9)-(line 598,col 25)",
        "(line 599,col 9)-(line 599,col 25)",
        "(line 600,col 9)-(line 600,col 25)",
        "(line 602,col 9)-(line 602,col 35)",
        "(line 603,col 9)-(line 603,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.getBlockSize()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n     * Returns the blocksize parameter specified at construction time.\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 613,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 616,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 633,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write0(int)",
      "begin_line": 640,
      "end_line": 659,
      "comment": "\n     * Keeps track of the last bytes written and implicitly performs\n     * run-length encoding as the first step of the bzip2 algorithm.\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 658,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbAssignCodes(int[], byte[], int, int, int)",
      "begin_line": 661,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 20)",
        "(line 665,col 9)-(line 673,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsFinishedWithStream()",
      "begin_line": 676,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 677,col 9)-(line 682,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(int, int)",
      "begin_line": 685,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 48)",
        "(line 687,col 9)-(line 687,col 39)",
        "(line 688,col 9)-(line 688,col 39)",
        "(line 690,col 9)-(line 694,col 9)",
        "(line 696,col 9)-(line 696,col 68)",
        "(line 697,col 9)-(line 697,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(int)",
      "begin_line": 700,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutInt(int)",
      "begin_line": 704,
      "end_line": 709,
      "comment": "",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 33)",
        "(line 706,col 9)-(line 706,col 33)",
        "(line 707,col 9)-(line 707,col 32)",
        "(line 708,col 9)-(line 708,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues()",
      "begin_line": 711,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 57)",
        "(line 713,col 9)-(line 713,col 46)",
        "(line 715,col 9)-(line 720,col 9)",
        "(line 724,col 9)-(line 725,col 66)",
        "(line 728,col 9)-(line 728,col 43)",
        "(line 733,col 9)-(line 733,col 66)",
        "(line 736,col 9)-(line 736,col 44)",
        "(line 739,col 9)-(line 739,col 43)",
        "(line 742,col 9)-(line 742,col 25)",
        "(line 745,col 9)-(line 745,col 44)",
        "(line 748,col 9)-(line 748,col 43)",
        "(line 751,col 9)-(line 751,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues0(int, int)",
      "begin_line": 754,
      "end_line": 787,
      "comment": "",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 57)",
        "(line 756,col 9)-(line 756,col 48)",
        "(line 758,col 9)-(line 758,col 29)",
        "(line 759,col 9)-(line 759,col 19)",
        "(line 761,col 9)-(line 786,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues1(int, int)",
      "begin_line": 789,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 42)",
        "(line 791,col 9)-(line 791,col 61)",
        "(line 792,col 9)-(line 792,col 57)",
        "(line 793,col 9)-(line 793,col 59)",
        "(line 794,col 9)-(line 794,col 46)",
        "(line 795,col 9)-(line 795,col 52)",
        "(line 796,col 9)-(line 796,col 58)",
        "(line 797,col 9)-(line 797,col 36)",
        "(line 798,col 9)-(line 798,col 36)",
        "(line 799,col 9)-(line 799,col 36)",
        "(line 800,col 9)-(line 800,col 36)",
        "(line 801,col 9)-(line 801,col 36)",
        "(line 802,col 9)-(line 802,col 36)",
        "(line 803,col 9)-(line 803,col 41)",
        "(line 805,col 9)-(line 805,col 27)",
        "(line 807,col 9)-(line 902,col 9)",
        "(line 904,col 9)-(line 904,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues2(int, int)",
      "begin_line": 907,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 42)",
        "(line 911,col 9)-(line 911,col 51)",
        "(line 913,col 9)-(line 915,col 9)",
        "(line 917,col 9)-(line 931,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues3(int, int)",
      "begin_line": 934,
      "end_line": 957,
      "comment": "",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 52)",
        "(line 936,col 9)-(line 936,col 51)",
        "(line 938,col 9)-(line 956,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues4()",
      "begin_line": 959,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 960,col 9)-(line 960,col 48)",
        "(line 961,col 9)-(line 961,col 67)",
        "(line 963,col 9)-(line 971,col 9)",
        "(line 973,col 9)-(line 975,col 9)",
        "(line 977,col 9)-(line 977,col 48)",
        "(line 978,col 9)-(line 978,col 39)",
        "(line 979,col 9)-(line 979,col 39)",
        "(line 981,col 9)-(line 997,col 9)",
        "(line 999,col 9)-(line 999,col 35)",
        "(line 1000,col 9)-(line 1000,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues5(int, int)",
      "begin_line": 1003,
      "end_line": 1038,
      "comment": "",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 24)",
        "(line 1006,col 9)-(line 1006,col 28)",
        "(line 1008,col 9)-(line 1008,col 48)",
        "(line 1009,col 9)-(line 1009,col 57)",
        "(line 1011,col 9)-(line 1011,col 39)",
        "(line 1012,col 9)-(line 1012,col 39)",
        "(line 1014,col 9)-(line 1034,col 9)",
        "(line 1036,col 9)-(line 1036,col 35)",
        "(line 1037,col 9)-(line 1037,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues6(int, int)",
      "begin_line": 1040,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 57)",
        "(line 1043,col 9)-(line 1043,col 48)",
        "(line 1045,col 9)-(line 1045,col 39)",
        "(line 1046,col 9)-(line 1046,col 39)",
        "(line 1048,col 9)-(line 1098,col 9)",
        "(line 1100,col 9)-(line 1100,col 35)",
        "(line 1101,col 9)-(line 1101,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues7()",
      "begin_line": 1104,
      "end_line": 1149,
      "comment": "",
      "child_ranges": [
        "(line 1105,col 9)-(line 1105,col 42)",
        "(line 1106,col 9)-(line 1106,col 58)",
        "(line 1107,col 9)-(line 1107,col 59)",
        "(line 1108,col 9)-(line 1108,col 48)",
        "(line 1109,col 9)-(line 1109,col 52)",
        "(line 1110,col 9)-(line 1110,col 46)",
        "(line 1111,col 9)-(line 1111,col 41)",
        "(line 1113,col 9)-(line 1113,col 23)",
        "(line 1115,col 9)-(line 1115,col 39)",
        "(line 1116,col 9)-(line 1116,col 39)",
        "(line 1118,col 9)-(line 1145,col 9)",
        "(line 1147,col 9)-(line 1147,col 35)",
        "(line 1148,col 9)-(line 1148,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.moveToFrontCodeAndSend()",
      "begin_line": 1151,
      "end_line": 1155,
      "comment": "",
      "child_ranges": [
        "(line 1152,col 9)-(line 1152,col 35)",
        "(line 1153,col 9)-(line 1153,col 28)",
        "(line 1154,col 9)-(line 1154,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.blockSort()",
      "begin_line": 1157,
      "end_line": 1159,
      "comment": "",
      "child_ranges": [
        "(line 1158,col 9)-(line 1158,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.generateMTFValues()",
      "begin_line": 1168,
      "end_line": 1269,
      "comment": "\n     * Performs Move-To-Front on the Burrows-Wheeler transformed\n     * buffer, storing the MTFed data in data.sfmap in RUNA/RUNB\n     * run-length-encoded form.\n     *\n     * \u003cp\u003eKeeps track of byte frequencies in data.mtfFreq at the same time.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1169,col 9)-(line 1169,col 41)",
        "(line 1170,col 9)-(line 1170,col 42)",
        "(line 1171,col 9)-(line 1171,col 49)",
        "(line 1172,col 9)-(line 1172,col 46)",
        "(line 1173,col 9)-(line 1173,col 43)",
        "(line 1174,col 9)-(line 1174,col 46)",
        "(line 1175,col 9)-(line 1175,col 49)",
        "(line 1176,col 9)-(line 1176,col 56)",
        "(line 1177,col 9)-(line 1177,col 58)",
        "(line 1180,col 9)-(line 1180,col 29)",
        "(line 1181,col 9)-(line 1186,col 9)",
        "(line 1187,col 9)-(line 1187,col 35)",
        "(line 1189,col 9)-(line 1189,col 41)",
        "(line 1191,col 9)-(line 1193,col 9)",
        "(line 1195,col 9)-(line 1197,col 9)",
        "(line 1199,col 9)-(line 1199,col 19)",
        "(line 1200,col 9)-(line 1200,col 22)",
        "(line 1202,col 9)-(line 1243,col 9)",
        "(line 1245,col 9)-(line 1264,col 9)",
        "(line 1266,col 9)-(line 1266,col 31)",
        "(line 1267,col 9)-(line 1267,col 23)",
        "(line 1268,col 9)-(line 1268,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 1271,
      "end_line": 1327,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 1275,
      "end_line": 1275,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unseqToSeq"
      ],
      "begin_line": 1276,
      "end_line": 1276,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mtfFreq"
      ],
      "begin_line": 1277,
      "end_line": 1277,
      "comment": " 1032 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 1278,
      "end_line": 1278,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 1279,
      "end_line": 1279,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "generateMTFValues_yy"
      ],
      "begin_line": 1281,
      "end_line": 1281,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_len"
      ],
      "begin_line": 1282,
      "end_line": 1282,
      "comment": " 1548"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_rfreq"
      ],
      "begin_line": 1284,
      "end_line": 1284,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_fave"
      ],
      "begin_line": 1286,
      "end_line": 1286,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_cost"
      ],
      "begin_line": 1287,
      "end_line": 1287,
      "comment": " 12 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_code"
      ],
      "begin_line": 1288,
      "end_line": 1288,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues2_pos"
      ],
      "begin_line": 1290,
      "end_line": 1290,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sentMTFValues4_inUse16"
      ],
      "begin_line": 1291,
      "end_line": 1291,
      "comment": " 16 byte"
    },
    {
      "type": "field",
      "varNames": [
        "heap"
      ],
      "begin_line": 1293,
      "end_line": 1293,
      "comment": " 1040 byte"
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 1294,
      "end_line": 1294,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1295,
      "end_line": 1295,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "block"
      ],
      "begin_line": 1303,
      "end_line": 1303,
      "comment": " 900021 byte"
    },
    {
      "type": "field",
      "varNames": [
        "fmap"
      ],
      "begin_line": 1306,
      "end_line": 1306,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sfmap"
      ],
      "begin_line": 1307,
      "end_line": 1307,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 1318,
      "end_line": 1318,
      "comment": "\n         * Index of original line in Burrows-Wheeler table.\n         *\n         * \u003cp\u003eThis is the index in fmap that points to the last byte\n         * of the original data.\u003c/p\u003e\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data.Data(int)",
      "begin_line": 1320,
      "end_line": 1325,
      "comment": "",
      "child_ranges": [
        "(line 1321,col 13)-(line 1321,col 71)",
        "(line 1322,col 13)-(line 1322,col 65)",
        "(line 1323,col 13)-(line 1323,col 35)",
        "(line 1324,col 13)-(line 1324,col 41)"
      ]
    }
  ]
}