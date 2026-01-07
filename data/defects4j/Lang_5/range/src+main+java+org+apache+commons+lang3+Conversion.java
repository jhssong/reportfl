{
  "filepath": "/tmp/Lang-5b/src/main/java/org/apache/commons/lang3/Conversion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Conversion",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 65,
      "end_line": 1717,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.hexDigitToInt(char)",
      "begin_line": 78,
      "end_line": 86,
      "comment": "\n     * \u003cp\u003e\n     * Converts a hexadecimal digit into an int using the default (Lsb0) bit ordering.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u00271\u0027 is converted to 1\n     * \u003c/p\u003e\n     * \n     * @param hexDigit the hexadecimal digit to convert\n     * @return an int equals to {@code hexDigit}\n     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 56)",
        "(line 80,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt(char)",
      "begin_line": 100,
      "end_line": 145,
      "comment": "\n     * \u003cp\u003e\n     * Converts a hexadecimal digit into an int using the Msb0 bit ordering.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u00271\u0027 is converted to 8\n     * \u003c/p\u003e\n     * \n     * @param hexDigit the hexadecimal digit to convert\n     * @return an int equals to {@code hexDigit}\n     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.hexDigitToBinary(char)",
      "begin_line": 160,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003e\n     * Converts a hexadecimal digit into binary (represented as boolean array) using the default\n     * (Lsb0) bit ordering.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u00271\u0027 is converted as follow: (1, 0, 0, 0)\n     * \u003c/p\u003e\n     * \n     * @param hexDigit the hexadecimal digit to convert\n     * @return a boolean array with the binary representation of {@code hexDigit}\n     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary(char)",
      "begin_line": 220,
      "end_line": 265,
      "comment": "\n     * \u003cp\u003e\n     * Converts a hexadecimal digit into binary (represented as boolean array) using the Msb0\n     * bit ordering.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u00271\u0027 is converted as follow: (0, 0, 0, 1)\n     * \u003c/p\u003e\n     * \n     * @param hexDigit the hexadecimal digit to convert\n     * @return a boolean array with the binary representation of {@code hexDigit}\n     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.binaryToHexDigit(boolean[])",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * \u003cp\u003e\n     * Converts binary (represented as boolean array) to a hexadecimal digit using the default\n     * (Lsb0) bit ordering.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * (1, 0, 0, 0) is converted as follow: \u00271\u0027\n     * \u003c/p\u003e\n     * \n     * @param src the binary to convert\n     * @return a hexadecimal digit representing the selected bits\n     * @throws IllegalArgumentException if {@code src} is empty\n     * @throws NullPointerException if {@code src} is {@code null}\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.binaryToHexDigit(boolean[], int)",
      "begin_line": 300,
      "end_line": 365,
      "comment": "\n     * \u003cp\u003e\n     * Converts binary (represented as boolean array) to a hexadecimal digit using the default\n     * (Lsb0) bit ordering.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * (1, 0, 0, 0) is converted as follow: \u00271\u0027\n     * \u003c/p\u003e\n     * \n     * @param src the binary to convert\n     * @param srcPos the position of the lsb to start the conversion\n     * @return a hexadecimal digit representing the selected bits\n     * @throws IllegalArgumentException if {@code src} is empty\n     * @throws NullPointerException if {@code src} is {@code null}\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(boolean[])",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * \u003cp\u003e\n     * Converts binary (represented as boolean array) to a hexadecimal digit using the Msb0 bit\n     * ordering.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * (1, 0, 0, 0) is converted as follow: \u00278\u0027\n     * \u003c/p\u003e\n     * \n     * @param src the binary to convert\n     * @return a hexadecimal digit representing the selected bits\n     * @throws IllegalArgumentException if {@code src} is empty, {@code src.length \u003c 4} or\n     *             {@code src.length \u003e 8}\n     * @throws NullPointerException if {@code src} is {@code null}\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(boolean[], int)",
      "begin_line": 403,
      "end_line": 474,
      "comment": "\n     * \u003cp\u003e\n     * Converts binary (represented as boolean array) to a hexadecimal digit using the Msb0 bit\n     * ordering.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * (1, 0, 0, 0) is converted as follow: \u00278\u0027 (1,0,0,1,1,0,1,0) with srcPos \u003d 3 is converted\n     * to \u0027D\u0027\n     * \u003c/p\u003e\n     * \n     * @param src the binary to convert\n     * @param srcPos the position of the lsb to start the conversion\n     * @return a hexadecimal digit representing the selected bits\n     * @throws IllegalArgumentException if {@code src} is empty, {@code src.length \u003e 8} or\n     *             {@code src.length - srcPos \u003c 4}\n     * @throws NullPointerException if {@code src} is {@code null}\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(boolean[])",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\n     * \u003cp\u003e\n     * Converts the first 4 bits of a binary (represented as boolean array) in big endian Msb0\n     * bit ordering to a hexadecimal digit.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * (1, 0, 0, 0) is converted as follow: \u00278\u0027 (1,0,0,0,0,0,0,0, 0,0,0,0,0,1,0,0) is converted\n     * to \u00274\u0027\n     * \u003c/p\u003e\n     * \n     * @param src the binary to convert\n     * @return a hexadecimal digit representing the selected bits\n     * @throws IllegalArgumentException if {@code src} is empty\n     * @throws NullPointerException if {@code src} is {@code null}\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(boolean[], int)",
      "begin_line": 511,
      "end_line": 582,
      "comment": "\n     * \u003cp\u003e\n     * Converts a binary (represented as boolean array) in big endian Msb0 bit ordering to a\n     * hexadecimal digit.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * (1, 0, 0, 0) with srcPos \u003d 0 is converted as follow: \u00278\u0027 (1,0,0,0,0,0,0,0,\n     * 0,0,0,1,0,1,0,0) with srcPos \u003d 2 is converted to \u00275\u0027\n     * \u003c/p\u003e\n     * \n     * @param src the binary to convert\n     * @param srcPos the position of the lsb to start the conversion\n     * @return a hexadecimal digit representing the selected bits\n     * @throws IllegalArgumentException if {@code src} is empty\n     * @throws NullPointerException if {@code src} is {@code null}\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 47)",
        "(line 516,col 9)-(line 516,col 47)",
        "(line 517,col 9)-(line 517,col 45)",
        "(line 518,col 9)-(line 518,col 84)",
        "(line 519,col 9)-(line 519,col 24)",
        "(line 520,col 9)-(line 520,col 19)",
        "(line 521,col 9)-(line 581,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.intToHexDigit(int)",
      "begin_line": 602,
      "end_line": 608,
      "comment": "\n     * \u003cp\u003e\n     * Converts the 4 lsb of an int to a hexadecimal digit.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * 0 returns \u00270\u0027\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * 1 returns \u00271\u0027\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * 10 returns \u0027A\u0027 and so on...\n     * \u003c/p\u003e\n     * \n     * @param nibble the 4 bits to convert\n     * @return a hexadecimal digit representing the 4 lsb of {@code nibble}\n     * @throws IllegalArgumentException if {@code nibble \u003c 0} or {@code nibble \u003e 15}\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 48)",
        "(line 604,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.intToHexDigitMsb0(int)",
      "begin_line": 628,
      "end_line": 665,
      "comment": "\n     * \u003cp\u003e\n     * Converts the 4 lsb of an int to a hexadecimal digit encoded using the Msb0 bit ordering.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * 0 returns \u00270\u0027\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * 1 returns \u00278\u0027\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * 10 returns \u00275\u0027 and so on...\n     * \u003c/p\u003e\n     * \n     * @param nibble the 4 bits to convert\n     * @return a hexadecimal digit representing the 4 lsb of {@code nibble}\n     * @throws IllegalArgumentException if {@code nibble \u003c 0} or {@code nibble \u003e 15}\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 664,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.intArrayToLong(int[], int, long, int, int)",
      "begin_line": 684,
      "end_line": 701,
      "comment": "\n     * \u003cp\u003e\n     * Converts an array of int into a long using the default (little endian, Lsb0) byte and bit\n     * ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the int array to convert\n     * @param srcPos the position in {@code src}, in int unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination long\n     * @param dstPos the position of the lsb, in bits, in the result long\n     * @param nInts the number of ints to convert\n     * @return a long containing the selected bits\n     * @throws IllegalArgumentException if {@code (nInts-1)*32+dstPos \u003e\u003d 64}\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nInts \u003e src.length}\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 27)",
        "(line 693,col 9)-(line 693,col 22)",
        "(line 694,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 700,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.shortArrayToLong(short[], int, long, int, int)",
      "begin_line": 720,
      "end_line": 738,
      "comment": "\n     * \u003cp\u003e\n     * Converts an array of short into a long using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the short array to convert\n     * @param srcPos the position in {@code src}, in short unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination long\n     * @param dstPos the position of the lsb, in bits, in the result long\n     * @param nShorts the number of shorts to convert\n     * @return a long containing the selected bits\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws IllegalArgumentException if {@code (nShorts-1)*16+dstPos \u003e\u003d 64}\n     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nShorts \u003e src.length}\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 729,col 27)",
        "(line 730,col 9)-(line 730,col 22)",
        "(line 731,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 737,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.shortArrayToInt(short[], int, int, int, int)",
      "begin_line": 757,
      "end_line": 775,
      "comment": "\n     * \u003cp\u003e\n     * Converts an array of short into a int using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the short array to convert\n     * @param srcPos the position in {@code src}, in short unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination int\n     * @param dstPos the position of the lsb, in bits, in the result int\n     * @param nShorts the number of shorts to convert\n     * @return a int containing the selected bits\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws IllegalArgumentException if {@code (nShorts-1)*16+dstPos \u003e\u003d 32}\n     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nShorts \u003e src.length}\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 26)",
        "(line 767,col 9)-(line 767,col 22)",
        "(line 768,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.byteArrayToLong(byte[], int, long, int, int)",
      "begin_line": 794,
      "end_line": 812,
      "comment": "\n     * \u003cp\u003e\n     * Converts an array of byte into a long using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the byte array to convert\n     * @param srcPos the position in {@code src}, in byte unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination long\n     * @param dstPos the position of the lsb, in bits, in the result long\n     * @param nBytes the number of bytes to convert\n     * @return a long containing the selected bits\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws IllegalArgumentException if {@code (nBytes-1)*8+dstPos \u003e\u003d 64}\n     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBytes \u003e src.length}\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 803,col 27)",
        "(line 804,col 9)-(line 804,col 22)",
        "(line 805,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.byteArrayToInt(byte[], int, int, int, int)",
      "begin_line": 831,
      "end_line": 848,
      "comment": "\n     * \u003cp\u003e\n     * Converts an array of byte into a int using the default (little endian, Lsb0) byte and bit\n     * ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the byte array to convert\n     * @param srcPos the position in {@code src}, in byte unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination int\n     * @param dstPos the position of the lsb, in bits, in the result int\n     * @param nBytes the number of bytes to convert\n     * @return a int containing the selected bits\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws IllegalArgumentException if {@code (nBytes-1)*8+dstPos \u003e\u003d 32}\n     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBytes \u003e src.length}\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 839,col 26)",
        "(line 840,col 9)-(line 840,col 22)",
        "(line 841,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 847,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.byteArrayToShort(byte[], int, short, int, int)",
      "begin_line": 867,
      "end_line": 885,
      "comment": "\n     * \u003cp\u003e\n     * Converts an array of byte into a short using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the byte array to convert\n     * @param srcPos the position in {@code src}, in byte unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination short\n     * @param dstPos the position of the lsb, in bits, in the result short\n     * @param nBytes the number of bytes to convert\n     * @return a short containing the selected bits\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws IllegalArgumentException if {@code (nBytes-1)*8+dstPos \u003e\u003d 16}\n     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBytes \u003e src.length}\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 876,col 28)",
        "(line 877,col 9)-(line 877,col 22)",
        "(line 878,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.hexToLong(java.lang.String, int, long, int, int)",
      "begin_line": 902,
      "end_line": 919,
      "comment": "\n     * \u003cp\u003e\n     * Converts an array of Char into a long using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the hex string to convert\n     * @param srcPos the position in {@code src}, in Char unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination long\n     * @param dstPos the position of the lsb, in bits, in the result long\n     * @param nHex the number of Chars to convert\n     * @return a long containing the selected bits\n     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos \u003e\u003d 64}\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 909,col 9)",
        "(line 910,col 9)-(line 910,col 27)",
        "(line 911,col 9)-(line 911,col 22)",
        "(line 912,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.hexToInt(java.lang.String, int, int, int, int)",
      "begin_line": 936,
      "end_line": 953,
      "comment": "\n     * \u003cp\u003e\n     * Converts an array of Char into a int using the default (little endian, Lsb0) byte and bit\n     * ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the hex string to convert\n     * @param srcPos the position in {@code src}, in Char unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination int\n     * @param dstPos the position of the lsb, in bits, in the result int\n     * @param nHex the number of Chars to convert\n     * @return a int containing the selected bits\n     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos \u003e\u003d 32}\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 939,col 9)",
        "(line 940,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 26)",
        "(line 945,col 9)-(line 945,col 22)",
        "(line 946,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 952,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.hexToShort(java.lang.String, int, short, int, int)",
      "begin_line": 970,
      "end_line": 987,
      "comment": "\n     * \u003cp\u003e\n     * Converts an array of Char into a short using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the hex string to convert\n     * @param srcPos the position in {@code src}, in Char unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination short\n     * @param dstPos the position of the lsb, in bits, in the result short\n     * @param nHex the number of Chars to convert\n     * @return a short containing the selected bits\n     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos \u003e\u003d 16}\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 973,col 9)",
        "(line 974,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 978,col 28)",
        "(line 979,col 9)-(line 979,col 22)",
        "(line 980,col 9)-(line 985,col 9)",
        "(line 986,col 9)-(line 986,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.hexToByte(java.lang.String, int, byte, int, int)",
      "begin_line": 1004,
      "end_line": 1021,
      "comment": "\n     * \u003cp\u003e\n     * Converts an array of Char into a byte using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the hex string to convert\n     * @param srcPos the position in {@code src}, in Char unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination byte\n     * @param dstPos the position of the lsb, in bits, in the result byte\n     * @param nHex the number of Chars to convert\n     * @return a byte containing the selected bits\n     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos \u003e\u003d 8}\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1012,col 27)",
        "(line 1013,col 9)-(line 1013,col 22)",
        "(line 1014,col 9)-(line 1019,col 9)",
        "(line 1020,col 9)-(line 1020,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.binaryToLong(boolean[], int, long, int, int)",
      "begin_line": 1040,
      "end_line": 1058,
      "comment": "\n     * \u003cp\u003e\n     * Converts binary (represented as boolean array) into a long using the default (little\n     * endian, Lsb0) byte and bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the binary to convert\n     * @param srcPos the position in {@code src}, in boolean unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination long\n     * @param dstPos the position of the lsb, in bits, in the result long\n     * @param nBools the number of booleans to convert\n     * @return a long containing the selected bits\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws IllegalArgumentException if {@code nBools-1+dstPos \u003e\u003d 64}\n     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools \u003e src.length}\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1044,col 9)",
        "(line 1045,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1049,col 27)",
        "(line 1050,col 9)-(line 1050,col 22)",
        "(line 1051,col 9)-(line 1056,col 9)",
        "(line 1057,col 9)-(line 1057,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.binaryToInt(boolean[], int, int, int, int)",
      "begin_line": 1077,
      "end_line": 1094,
      "comment": "\n     * \u003cp\u003e\n     * Converts binary (represented as boolean array) into a int using the default (little\n     * endian, Lsb0) byte and bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the binary to convert\n     * @param srcPos the position in {@code src}, in boolean unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination int\n     * @param dstPos the position of the lsb, in bits, in the result int\n     * @param nBools the number of booleans to convert\n     * @return a int containing the selected bits\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws IllegalArgumentException if {@code nBools-1+dstPos \u003e\u003d 32}\n     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools \u003e src.length}\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1080,col 9)",
        "(line 1081,col 9)-(line 1084,col 9)",
        "(line 1085,col 9)-(line 1085,col 26)",
        "(line 1086,col 9)-(line 1086,col 22)",
        "(line 1087,col 9)-(line 1092,col 9)",
        "(line 1093,col 9)-(line 1093,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.binaryToShort(boolean[], int, short, int, int)",
      "begin_line": 1113,
      "end_line": 1131,
      "comment": "\n     * \u003cp\u003e\n     * Converts binary (represented as boolean array) into a short using the default (little\n     * endian, Lsb0) byte and bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the binary to convert\n     * @param srcPos the position in {@code src}, in boolean unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination short\n     * @param dstPos the position of the lsb, in bits, in the result short\n     * @param nBools the number of booleans to convert\n     * @return a short containing the selected bits\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws IllegalArgumentException if {@code nBools-1+dstPos \u003e\u003d 16}\n     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools \u003e src.length}\n     ",
      "child_ranges": [
        "(line 1115,col 9)-(line 1117,col 9)",
        "(line 1118,col 9)-(line 1121,col 9)",
        "(line 1122,col 9)-(line 1122,col 28)",
        "(line 1123,col 9)-(line 1123,col 22)",
        "(line 1124,col 9)-(line 1129,col 9)",
        "(line 1130,col 9)-(line 1130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.binaryToByte(boolean[], int, byte, int, int)",
      "begin_line": 1150,
      "end_line": 1167,
      "comment": "\n     * \u003cp\u003e\n     * Converts binary (represented as boolean array) into a byte using the default (little\n     * endian, Lsb0) byte and bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the binary to convert\n     * @param srcPos the position in {@code src}, in boolean unit, from where to start the\n     *            conversion\n     * @param dstInit initial value of the destination byte\n     * @param dstPos the position of the lsb, in bits, in the result byte\n     * @param nBools the number of booleans to convert\n     * @return a byte containing the selected bits\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws IllegalArgumentException if {@code nBools-1+dstPos \u003e\u003d 8}\n     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools \u003e src.length}\n     ",
      "child_ranges": [
        "(line 1152,col 9)-(line 1154,col 9)",
        "(line 1155,col 9)-(line 1157,col 9)",
        "(line 1158,col 9)-(line 1158,col 27)",
        "(line 1159,col 9)-(line 1159,col 22)",
        "(line 1160,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1166,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.longToIntArray(long, int, int[], int, int)",
      "begin_line": 1186,
      "end_line": 1200,
      "comment": "\n     * \u003cp\u003e\n     * Converts a long into an array of int using the default (little endian, Lsb0) byte and bit\n     * ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the long to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nInts the number of ints to copy to {@code dst}, must be smaller or equal to the\n     *            width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null} and {@code nInts \u003e 0}\n     * @throws IllegalArgumentException if {@code (nInts-1)*32+srcPos \u003e\u003d 64}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nInts \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1187,col 9)-(line 1189,col 9)",
        "(line 1190,col 9)-(line 1193,col 9)",
        "(line 1194,col 9)-(line 1194,col 22)",
        "(line 1195,col 9)-(line 1198,col 9)",
        "(line 1199,col 9)-(line 1199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.longToShortArray(long, int, short[], int, int)",
      "begin_line": 1219,
      "end_line": 1234,
      "comment": "\n     * \u003cp\u003e\n     * Converts a long into an array of short using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the long to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nShorts the number of shorts to copy to {@code dst}, must be smaller or equal to\n     *            the width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null}\n     * @throws IllegalArgumentException if {@code (nShorts-1)*16+srcPos \u003e\u003d 64}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nShorts \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1221,col 9)-(line 1223,col 9)",
        "(line 1224,col 9)-(line 1227,col 9)",
        "(line 1228,col 9)-(line 1228,col 22)",
        "(line 1229,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1233,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.intToShortArray(int, int, short[], int, int)",
      "begin_line": 1253,
      "end_line": 1268,
      "comment": "\n     * \u003cp\u003e\n     * Converts a int into an array of short using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the int to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nShorts the number of shorts to copy to {@code dst}, must be smaller or equal to\n     *            the width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null}\n     * @throws IllegalArgumentException if {@code (nShorts-1)*16+srcPos \u003e\u003d 32}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nShorts \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1255,col 9)-(line 1257,col 9)",
        "(line 1258,col 9)-(line 1261,col 9)",
        "(line 1262,col 9)-(line 1262,col 22)",
        "(line 1263,col 9)-(line 1266,col 9)",
        "(line 1267,col 9)-(line 1267,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.longToByteArray(long, int, byte[], int, int)",
      "begin_line": 1287,
      "end_line": 1302,
      "comment": "\n     * \u003cp\u003e\n     * Converts a long into an array of byte using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the long to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the\n     *            width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null}\n     * @throws IllegalArgumentException if {@code (nBytes-1)*8+srcPos \u003e\u003d 64}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1291,col 9)",
        "(line 1292,col 9)-(line 1295,col 9)",
        "(line 1296,col 9)-(line 1296,col 22)",
        "(line 1297,col 9)-(line 1300,col 9)",
        "(line 1301,col 9)-(line 1301,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.intToByteArray(int, int, byte[], int, int)",
      "begin_line": 1321,
      "end_line": 1335,
      "comment": "\n     * \u003cp\u003e\n     * Converts a int into an array of byte using the default (little endian, Lsb0) byte and bit\n     * ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the int to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the\n     *            width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null}\n     * @throws IllegalArgumentException if {@code (nBytes-1)*8+srcPos \u003e\u003d 32}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1322,col 9)-(line 1324,col 9)",
        "(line 1325,col 9)-(line 1328,col 9)",
        "(line 1329,col 9)-(line 1329,col 22)",
        "(line 1330,col 9)-(line 1333,col 9)",
        "(line 1334,col 9)-(line 1334,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.shortToByteArray(short, int, byte[], int, int)",
      "begin_line": 1354,
      "end_line": 1369,
      "comment": "\n     * \u003cp\u003e\n     * Converts a short into an array of byte using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the short to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the\n     *            width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null}\n     * @throws IllegalArgumentException if {@code (nBytes-1)*8+srcPos \u003e\u003d 16}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1356,col 9)-(line 1358,col 9)",
        "(line 1359,col 9)-(line 1362,col 9)",
        "(line 1363,col 9)-(line 1363,col 22)",
        "(line 1364,col 9)-(line 1367,col 9)",
        "(line 1368,col 9)-(line 1368,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.longToHex(long, int, java.lang.String, int, int)",
      "begin_line": 1387,
      "end_line": 1409,
      "comment": "\n     * \u003cp\u003e\n     * Converts a long into an array of Char using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the long to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dstInit the initial value for the result String\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the\n     *            width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos \u003e\u003d 64}\n     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() \u003c dstPos}\n     ",
      "child_ranges": [
        "(line 1388,col 9)-(line 1390,col 9)",
        "(line 1391,col 9)-(line 1394,col 9)",
        "(line 1395,col 9)-(line 1395,col 54)",
        "(line 1396,col 9)-(line 1396,col 22)",
        "(line 1397,col 9)-(line 1397,col 33)",
        "(line 1398,col 9)-(line 1407,col 9)",
        "(line 1408,col 9)-(line 1408,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.intToHex(int, int, java.lang.String, int, int)",
      "begin_line": 1427,
      "end_line": 1449,
      "comment": "\n     * \u003cp\u003e\n     * Converts a int into an array of Char using the default (little endian, Lsb0) byte and bit\n     * ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the int to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dstInit the initial value for the result String\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the\n     *            width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos \u003e\u003d 32}\n     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() \u003c dstPos}\n     ",
      "child_ranges": [
        "(line 1428,col 9)-(line 1430,col 9)",
        "(line 1431,col 9)-(line 1434,col 9)",
        "(line 1435,col 9)-(line 1435,col 54)",
        "(line 1436,col 9)-(line 1436,col 22)",
        "(line 1437,col 9)-(line 1437,col 33)",
        "(line 1438,col 9)-(line 1447,col 9)",
        "(line 1448,col 9)-(line 1448,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.shortToHex(short, int, java.lang.String, int, int)",
      "begin_line": 1467,
      "end_line": 1489,
      "comment": "\n     * \u003cp\u003e\n     * Converts a short into an array of Char using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the short to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dstInit the initial value for the result String\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the\n     *            width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos \u003e\u003d 16}\n     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() \u003c dstPos}\n     ",
      "child_ranges": [
        "(line 1468,col 9)-(line 1470,col 9)",
        "(line 1471,col 9)-(line 1474,col 9)",
        "(line 1475,col 9)-(line 1475,col 54)",
        "(line 1476,col 9)-(line 1476,col 22)",
        "(line 1477,col 9)-(line 1477,col 33)",
        "(line 1478,col 9)-(line 1487,col 9)",
        "(line 1488,col 9)-(line 1488,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.byteToHex(byte, int, java.lang.String, int, int)",
      "begin_line": 1507,
      "end_line": 1529,
      "comment": "\n     * \u003cp\u003e\n     * Converts a byte into an array of Char using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the byte to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dstInit the initial value for the result String\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the\n     *            width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos \u003e\u003d 8}\n     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() \u003c dstPos}\n     ",
      "child_ranges": [
        "(line 1508,col 9)-(line 1510,col 9)",
        "(line 1511,col 9)-(line 1514,col 9)",
        "(line 1515,col 9)-(line 1515,col 54)",
        "(line 1516,col 9)-(line 1516,col 22)",
        "(line 1517,col 9)-(line 1517,col 33)",
        "(line 1518,col 9)-(line 1527,col 9)",
        "(line 1528,col 9)-(line 1528,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.longToBinary(long, int, boolean[], int, int)",
      "begin_line": 1548,
      "end_line": 1563,
      "comment": "\n     * \u003cp\u003e\n     * Converts a long into an array of boolean using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the long to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to\n     *            the width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null}\n     * @throws IllegalArgumentException if {@code nBools-1+srcPos \u003e\u003d 64}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1550,col 9)-(line 1552,col 9)",
        "(line 1553,col 9)-(line 1556,col 9)",
        "(line 1557,col 9)-(line 1557,col 22)",
        "(line 1558,col 9)-(line 1561,col 9)",
        "(line 1562,col 9)-(line 1562,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.intToBinary(int, int, boolean[], int, int)",
      "begin_line": 1582,
      "end_line": 1597,
      "comment": "\n     * \u003cp\u003e\n     * Converts a int into an array of boolean using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the int to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to\n     *            the width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null}\n     * @throws IllegalArgumentException if {@code nBools-1+srcPos \u003e\u003d 32}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1584,col 9)-(line 1586,col 9)",
        "(line 1587,col 9)-(line 1590,col 9)",
        "(line 1591,col 9)-(line 1591,col 22)",
        "(line 1592,col 9)-(line 1595,col 9)",
        "(line 1596,col 9)-(line 1596,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.shortToBinary(short, int, boolean[], int, int)",
      "begin_line": 1616,
      "end_line": 1632,
      "comment": "\n     * \u003cp\u003e\n     * Converts a short into an array of boolean using the default (little endian, Lsb0) byte\n     * and bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the short to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to\n     *            the width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null}\n     * @throws IllegalArgumentException if {@code nBools-1+srcPos \u003e\u003d 16}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1620,col 9)",
        "(line 1621,col 9)-(line 1624,col 9)",
        "(line 1625,col 9)-(line 1625,col 22)",
        "(line 1626,col 9)-(line 1626,col 48)",
        "(line 1627,col 9)-(line 1630,col 9)",
        "(line 1631,col 9)-(line 1631,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.byteToBinary(byte, int, boolean[], int, int)",
      "begin_line": 1651,
      "end_line": 1665,
      "comment": "\n     * \u003cp\u003e\n     * Converts a byte into an array of boolean using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the byte to convert\n     * @param srcPos the position in {@code src}, in bits, from where to start the conversion\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to\n     *            the width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null}\n     * @throws IllegalArgumentException if {@code nBools-1+srcPos \u003e\u003d 8}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1653,col 9)-(line 1655,col 9)",
        "(line 1656,col 9)-(line 1658,col 9)",
        "(line 1659,col 9)-(line 1659,col 22)",
        "(line 1660,col 9)-(line 1663,col 9)",
        "(line 1664,col 9)-(line 1664,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.uuidToByteArray(java.util.UUID, byte[], int, int)",
      "begin_line": 1683,
      "end_line": 1695,
      "comment": "\n     * \u003cp\u003e\n     * Converts UUID into an array of byte using the default (little endian, Lsb0) byte and bit\n     * ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the UUID to convert\n     * @param dst the destination array\n     * @param dstPos the position in {@code dst} where to copy the result\n     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the\n     *            width of the input (from srcPos to msb)\n     * @return {@code dst}\n     * @throws NullPointerException if {@code dst} is {@code null}\n     * @throws IllegalArgumentException if {@code nBytes \u003e 16}\n     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes \u003e dst.length}\n     ",
      "child_ranges": [
        "(line 1684,col 9)-(line 1686,col 9)",
        "(line 1687,col 9)-(line 1689,col 9)",
        "(line 1690,col 9)-(line 1690,col 95)",
        "(line 1691,col 9)-(line 1693,col 9)",
        "(line 1694,col 9)-(line 1694,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Conversion.byteArrayToUuid(byte[], int)",
      "begin_line": 1710,
      "end_line": 1716,
      "comment": "\n     * \u003cp\u003e\n     * Converts bytes from an array into a UUID using the default (little endian, Lsb0) byte and\n     * bit ordering.\n     * \u003c/p\u003e\n     * \n     * @param src the byte array to convert\n     * @param srcPos the position in {@code src} where to copy the result from\n     * @return a UUID\n     * @throws NullPointerException if {@code src} is {@code null}\n     * @throws IllegalArgumentException if array does not contain at least 16 bytes beginning\n     *             with {@code srcPos}\n     ",
      "child_ranges": [
        "(line 1711,col 9)-(line 1713,col 9)",
        "(line 1714,col 9)-(line 1715,col 39)"
      ]
    }
  ]
}