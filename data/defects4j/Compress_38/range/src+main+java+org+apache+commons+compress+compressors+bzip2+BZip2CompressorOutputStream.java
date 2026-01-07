{
  "filepath": "/tmp/Compress-38b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java",
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
      "end_line": 1330,
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
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize(long)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * Chooses a blocksize based on the given length of the data to compress.\n     *\n     * @return The blocksize, between {@link #MIN_BLOCKSIZE} and\n     *         {@link #MAX_BLOCKSIZE} both inclusive. For a negative\n     *         {@code inputLength} this method returns {@code MAX_BLOCKSIZE}\n     *         always.\n     *\n     * @param inputLength\n     *            The length of the data which will be compressed by\n     *            {@code BZip2CompressorOutputStream}.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 340,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 354,
      "end_line": 357,
      "comment": "\n     * Constructs a new {@code BZip2CompressorOutputStream} with a blocksize of 900k.\n     *\n     * @param out \n     *            the destination stream.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream, int)",
      "begin_line": 377,
      "end_line": 391,
      "comment": "\n     * Constructs a new {@code BZip2CompressorOutputStream} with specified blocksize.\n     *\n     * @param out\n     *            the destination stream.\n     * @param blockSize\n     *            the blockSize as 100k units.\n     *\n     * @throws IOException\n     *             if an I/O error occurs in the specified stream.\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003e(blockSize \u0026lt; 1) || (blockSize \u0026gt; 9)\u003c/code\u003e.\n     * @throws NullPointerException\n     *             if \u003ccode\u003eout \u003d\u003d null\u003c/code\u003e.\n     *\n     * @see #MIN_BLOCKSIZE\n     * @see #MAX_BLOCKSIZE\n     ",
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
        "(line 507,col 9)-(line 507,col 48)",
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
        "(line 540,col 9)-(line 540,col 48)",
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
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n     * Returns the blocksize parameter specified at construction time.\n     * @return the blocksize parameter specified at construction time\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 614,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 630,col 9)",
        "(line 632,col 9)-(line 634,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write0(int)",
      "begin_line": 641,
      "end_line": 660,
      "comment": "\n     * Keeps track of the last bytes written and implicitly performs\n     * run-length encoding as the first step of the bzip2 algorithm.\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbAssignCodes(int[], byte[], int, int, int)",
      "begin_line": 662,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 20)",
        "(line 666,col 9)-(line 674,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsFinishedWithStream()",
      "begin_line": 677,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 678,col 9)-(line 683,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(int, int)",
      "begin_line": 686,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 48)",
        "(line 688,col 9)-(line 688,col 39)",
        "(line 689,col 9)-(line 689,col 39)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 697,col 9)-(line 697,col 68)",
        "(line 698,col 9)-(line 698,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUByte(int)",
      "begin_line": 701,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutInt(int)",
      "begin_line": 705,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 33)",
        "(line 707,col 9)-(line 707,col 33)",
        "(line 708,col 9)-(line 708,col 32)",
        "(line 709,col 9)-(line 709,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues()",
      "begin_line": 712,
      "end_line": 753,
      "comment": "",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 57)",
        "(line 714,col 9)-(line 714,col 46)",
        "(line 716,col 9)-(line 721,col 9)",
        "(line 725,col 9)-(line 726,col 66)",
        "(line 729,col 9)-(line 729,col 43)",
        "(line 734,col 9)-(line 734,col 66)",
        "(line 737,col 9)-(line 737,col 44)",
        "(line 740,col 9)-(line 740,col 43)",
        "(line 743,col 9)-(line 743,col 25)",
        "(line 746,col 9)-(line 746,col 44)",
        "(line 749,col 9)-(line 749,col 43)",
        "(line 752,col 9)-(line 752,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues0(int, int)",
      "begin_line": 755,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 57)",
        "(line 757,col 9)-(line 757,col 48)",
        "(line 759,col 9)-(line 759,col 29)",
        "(line 760,col 9)-(line 760,col 19)",
        "(line 762,col 9)-(line 787,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues1(int, int)",
      "begin_line": 790,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 42)",
        "(line 792,col 9)-(line 792,col 61)",
        "(line 793,col 9)-(line 793,col 57)",
        "(line 794,col 9)-(line 794,col 59)",
        "(line 795,col 9)-(line 795,col 46)",
        "(line 796,col 9)-(line 796,col 52)",
        "(line 797,col 9)-(line 797,col 58)",
        "(line 798,col 9)-(line 798,col 36)",
        "(line 799,col 9)-(line 799,col 36)",
        "(line 800,col 9)-(line 800,col 36)",
        "(line 801,col 9)-(line 801,col 36)",
        "(line 802,col 9)-(line 802,col 36)",
        "(line 803,col 9)-(line 803,col 36)",
        "(line 804,col 9)-(line 804,col 41)",
        "(line 806,col 9)-(line 806,col 27)",
        "(line 808,col 9)-(line 903,col 9)",
        "(line 905,col 9)-(line 905,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues2(int, int)",
      "begin_line": 908,
      "end_line": 933,
      "comment": "",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 42)",
        "(line 912,col 9)-(line 912,col 57)",
        "(line 914,col 9)-(line 916,col 9)",
        "(line 918,col 9)-(line 932,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues3(int, int)",
      "begin_line": 935,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 58)",
        "(line 937,col 9)-(line 937,col 57)",
        "(line 939,col 9)-(line 957,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues4()",
      "begin_line": 960,
      "end_line": 1002,
      "comment": "",
      "child_ranges": [
        "(line 961,col 9)-(line 961,col 48)",
        "(line 962,col 9)-(line 962,col 67)",
        "(line 964,col 9)-(line 972,col 9)",
        "(line 974,col 9)-(line 976,col 9)",
        "(line 978,col 9)-(line 978,col 48)",
        "(line 979,col 9)-(line 979,col 39)",
        "(line 980,col 9)-(line 980,col 39)",
        "(line 982,col 9)-(line 998,col 9)",
        "(line 1000,col 9)-(line 1000,col 35)",
        "(line 1001,col 9)-(line 1001,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues5(int, int)",
      "begin_line": 1004,
      "end_line": 1039,
      "comment": "",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 24)",
        "(line 1007,col 9)-(line 1007,col 28)",
        "(line 1009,col 9)-(line 1009,col 48)",
        "(line 1010,col 9)-(line 1010,col 57)",
        "(line 1012,col 9)-(line 1012,col 39)",
        "(line 1013,col 9)-(line 1013,col 39)",
        "(line 1015,col 9)-(line 1035,col 9)",
        "(line 1037,col 9)-(line 1037,col 35)",
        "(line 1038,col 9)-(line 1038,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues6(int, int)",
      "begin_line": 1041,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 57)",
        "(line 1044,col 9)-(line 1044,col 48)",
        "(line 1046,col 9)-(line 1046,col 39)",
        "(line 1047,col 9)-(line 1047,col 39)",
        "(line 1049,col 9)-(line 1099,col 9)",
        "(line 1101,col 9)-(line 1101,col 35)",
        "(line 1102,col 9)-(line 1102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues7()",
      "begin_line": 1105,
      "end_line": 1150,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 42)",
        "(line 1107,col 9)-(line 1107,col 58)",
        "(line 1108,col 9)-(line 1108,col 59)",
        "(line 1109,col 9)-(line 1109,col 48)",
        "(line 1110,col 9)-(line 1110,col 52)",
        "(line 1111,col 9)-(line 1111,col 46)",
        "(line 1112,col 9)-(line 1112,col 41)",
        "(line 1114,col 9)-(line 1114,col 23)",
        "(line 1116,col 9)-(line 1116,col 39)",
        "(line 1117,col 9)-(line 1117,col 39)",
        "(line 1119,col 9)-(line 1146,col 9)",
        "(line 1148,col 9)-(line 1148,col 35)",
        "(line 1149,col 9)-(line 1149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.moveToFrontCodeAndSend()",
      "begin_line": 1152,
      "end_line": 1156,
      "comment": "",
      "child_ranges": [
        "(line 1153,col 9)-(line 1153,col 35)",
        "(line 1154,col 9)-(line 1154,col 28)",
        "(line 1155,col 9)-(line 1155,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.blockSort()",
      "begin_line": 1158,
      "end_line": 1160,
      "comment": "",
      "child_ranges": [
        "(line 1159,col 9)-(line 1159,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.generateMTFValues()",
      "begin_line": 1169,
      "end_line": 1270,
      "comment": "\n     * Performs Move-To-Front on the Burrows-Wheeler transformed\n     * buffer, storing the MTFed data in data.sfmap in RUNA/RUNB\n     * run-length-encoded form.\n     *\n     * \u003cp\u003eKeeps track of byte frequencies in data.mtfFreq at the same time.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1170,col 41)",
        "(line 1171,col 9)-(line 1171,col 42)",
        "(line 1172,col 9)-(line 1172,col 49)",
        "(line 1173,col 9)-(line 1173,col 46)",
        "(line 1174,col 9)-(line 1174,col 43)",
        "(line 1175,col 9)-(line 1175,col 46)",
        "(line 1176,col 9)-(line 1176,col 49)",
        "(line 1177,col 9)-(line 1177,col 56)",
        "(line 1178,col 9)-(line 1178,col 58)",
        "(line 1181,col 9)-(line 1181,col 29)",
        "(line 1182,col 9)-(line 1187,col 9)",
        "(line 1188,col 9)-(line 1188,col 35)",
        "(line 1190,col 9)-(line 1190,col 41)",
        "(line 1192,col 9)-(line 1194,col 9)",
        "(line 1196,col 9)-(line 1198,col 9)",
        "(line 1200,col 9)-(line 1200,col 19)",
        "(line 1201,col 9)-(line 1201,col 22)",
        "(line 1203,col 9)-(line 1244,col 9)",
        "(line 1246,col 9)-(line 1265,col 9)",
        "(line 1267,col 9)-(line 1267,col 31)",
        "(line 1268,col 9)-(line 1268,col 23)",
        "(line 1269,col 9)-(line 1269,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1272,
      "end_line": 1328,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 1276,
      "end_line": 1276,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unseqToSeq"
      ],
      "begin_line": 1277,
      "end_line": 1277,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "mtfFreq"
      ],
      "begin_line": 1278,
      "end_line": 1278,
      "comment": " 1032 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 1279,
      "end_line": 1279,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 1280,
      "end_line": 1280,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "generateMTFValues_yy"
      ],
      "begin_line": 1282,
      "end_line": 1282,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_len"
      ],
      "begin_line": 1283,
      "end_line": 1283,
      "comment": " 1548"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_rfreq"
      ],
      "begin_line": 1285,
      "end_line": 1285,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_fave"
      ],
      "begin_line": 1287,
      "end_line": 1287,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_cost"
      ],
      "begin_line": 1288,
      "end_line": 1288,
      "comment": " 12 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues_code"
      ],
      "begin_line": 1289,
      "end_line": 1289,
      "comment": " 6192"
    },
    {
      "type": "field",
      "varNames": [
        "sendMTFValues2_pos"
      ],
      "begin_line": 1291,
      "end_line": 1291,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sentMTFValues4_inUse16"
      ],
      "begin_line": 1292,
      "end_line": 1292,
      "comment": " 16 byte"
    },
    {
      "type": "field",
      "varNames": [
        "heap"
      ],
      "begin_line": 1294,
      "end_line": 1294,
      "comment": " 1040 byte"
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 1295,
      "end_line": 1295,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1296,
      "end_line": 1296,
      "comment": " 2064 byte"
    },
    {
      "type": "field",
      "varNames": [
        "block"
      ],
      "begin_line": 1304,
      "end_line": 1304,
      "comment": " 900021 byte"
    },
    {
      "type": "field",
      "varNames": [
        "fmap"
      ],
      "begin_line": 1307,
      "end_line": 1307,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "sfmap"
      ],
      "begin_line": 1308,
      "end_line": 1308,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 1319,
      "end_line": 1319,
      "comment": "\n         * Index of original line in Burrows-Wheeler table.\n         *\n         * \u003cp\u003eThis is the index in fmap that points to the last byte\n         * of the original data.\u003c/p\u003e\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data.Data(int)",
      "begin_line": 1321,
      "end_line": 1326,
      "comment": "",
      "child_ranges": [
        "(line 1322,col 13)-(line 1322,col 71)",
        "(line 1323,col 13)-(line 1323,col 65)",
        "(line 1324,col 13)-(line 1324,col 35)",
        "(line 1325,col 13)-(line 1325,col 41)"
      ]
    }
  ]
}