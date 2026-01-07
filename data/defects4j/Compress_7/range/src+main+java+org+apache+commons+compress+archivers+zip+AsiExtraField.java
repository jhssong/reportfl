{
  "filepath": "/tmp/Compress-7b/src/main/java/org/apache/commons/compress/archivers/zip/AsiExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AsiExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField",
        "org.apache.commons.compress.archivers.zip.UnixStat",
        "java.lang.Cloneable"
      ],
      "begin_line": 53,
      "end_line": 330,
      "comment": "\n * Adds Unix file permission and UID/GID fields as well as symbolic\n * link handling.\n *\n * \u003cp\u003eThis class uses the ASi extra field in the format:\n * \u003cpre\u003e\n *         Value         Size            Description\n *         -----         ----            -----------\n * (Unix3) 0x756e        Short           tag for this extra block type\n *         TSize         Short           total data size for this block\n *         CRC           Long            CRC-32 of the remaining data\n *         Mode          Short           file permissions\n *         SizDev        Long            symlink\u0027d size OR major/minor dev num\n *         UID           Short           user ID\n *         GID           Short           group ID\n *         (var.)        variable        symbolic link filename\n * \u003c/pre\u003e\n * taken from appnote.iz (Info-ZIP note, 981119) found at \u003ca\n * href\u003d\"ftp://ftp.uu.net/pub/archiving/zip/doc/\"\u003eftp://ftp.uu.net/pub/archiving/zip/doc/\u003c/a\u003e\u003c/p\u003e\n\n *\n * \u003cp\u003eShort is two bytes and Long is four bytes in big endian byte and\n * word order, device numbers are currently not supported.\u003c/p\u003e\n * @NotThreadSafe\n *\n * \u003cp\u003eSince the documentation this class is based upon doesn\u0027t mention\n * the character encoding of the file name at all, it is assumed that\n * it uses the current platform\u0027s default encoding.\u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Standard Unix stat(2) file mode.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * User ID.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Group ID.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "link"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * File this entry points to, if it is a symbolic link.\n     *\n     * \u003cp\u003eempty string - if entry is not a symbolic link.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dirFlag"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Is this an entry for a directory?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Instance used to calculate checksums.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.AsiExtraField()",
      "begin_line": 86,
      "end_line": 87,
      "comment": " Constructor for AsiExtraField. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getHeaderId()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * The Header-ID.\n     * @return the value for the header id for this extrafield\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getLocalFileDataLength()",
      "begin_line": 102,
      "end_line": 110,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 108,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getCentralDirectoryLength()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Delegate to local file data.\n     * @return the centralDirectory length\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getLocalFileDataData()",
      "begin_line": 125,
      "end_line": 151,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 75)",
        "(line 128,col 9)-(line 128,col 70)",
        "(line 130,col 9)-(line 130,col 54)",
        "(line 132,col 9)-(line 133,col 43)",
        "(line 135,col 9)-(line 136,col 40)",
        "(line 137,col 9)-(line 138,col 40)",
        "(line 140,col 9)-(line 140,col 67)",
        "(line 143,col 9)-(line 143,col 20)",
        "(line 144,col 9)-(line 144,col 25)",
        "(line 145,col 9)-(line 145,col 39)",
        "(line 147,col 9)-(line 147,col 53)",
        "(line 148,col 9)-(line 148,col 73)",
        "(line 149,col 9)-(line 149,col 61)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getCentralDirectoryData()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Delegate to local file data.\n     * @return the local file data\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setUserId(int)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Set the user id.\n     * @param uid the user id\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getUserId()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Get the user id.\n     * @return the user id\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setGroupId(int)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Set the group id.\n     * @param gid the group id\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getGroupId()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Get the group id.\n     * @return the group id\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setLinkedFile(java.lang.String)",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\n     * Indicate that this entry is a symbolic link to the given filename.\n     *\n     * @param name Name of the file this entry links to, empty String\n     *             if it is not a symbolic link.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 20)",
        "(line 201,col 9)-(line 201,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getLinkedFile()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Name of linked file\n     *\n     * @return name of the file this entry links to if it is a\n     *         symbolic link, the empty string otherwise.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.isLink()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Is this entry a symbolic link?\n     * @return true if this is a symbolic link\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setMode(int)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * File mode of this file.\n     * @param mode the file mode\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getMode()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * File mode of this file.\n     * @return the file mode\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setDirectory(boolean)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * Indicate whether this entry is a directory.\n     * @param dirFlag if true, this entry is a directory\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 31)",
        "(line 244,col 9)-(line 244,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.isDirectory()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Is this entry a directory?\n     * @return true if this entry is a directory\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 262,
      "end_line": 293,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     * @param data an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 60)",
        "(line 266,col 9)-(line 266,col 45)",
        "(line 267,col 9)-(line 267,col 69)",
        "(line 268,col 9)-(line 268,col 20)",
        "(line 269,col 9)-(line 269,col 24)",
        "(line 270,col 9)-(line 270,col 43)",
        "(line 271,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 48)",
        "(line 280,col 9)-(line 280,col 68)",
        "(line 281,col 9)-(line 281,col 40)",
        "(line 282,col 9)-(line 282,col 40)",
        "(line 284,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 48)",
        "(line 292,col 9)-(line 292,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 299,
      "end_line": 303,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same data in central directory and local file data.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getMode(int)",
      "begin_line": 310,
      "end_line": 318,
      "comment": "\n     * Get the file mode for given permissions with the correct file type.\n     * @param mode the mode\n     * @return the type with the mode\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 29)",
        "(line 312,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.clone()",
      "begin_line": 320,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 328,col 9)"
      ]
    }
  ]
}