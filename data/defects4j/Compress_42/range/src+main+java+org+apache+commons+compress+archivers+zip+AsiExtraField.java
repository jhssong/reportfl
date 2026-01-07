{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/archivers/zip/AsiExtraField.java",
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
      "begin_line": 52,
      "end_line": 337,
      "comment": "\n * Adds Unix file permission and UID/GID fields as well as symbolic\n * link handling.\n *\n * \u003cp\u003eThis class uses the ASi extra field in the format:\u003c/p\u003e\n * \u003cpre\u003e\n *         Value         Size            Description\n *         -----         ----            -----------\n * (Unix3) 0x756e        Short           tag for this extra block type\n *         TSize         Short           total data size for this block\n *         CRC           Long            CRC-32 of the remaining data\n *         Mode          Short           file permissions\n *         SizDev        Long            symlink\u0027d size OR major/minor dev num\n *         UID           Short           user ID\n *         GID           Short           group ID\n *         (var.)        variable        symbolic link filename\n * \u003c/pre\u003e\n * \u003cp\u003etaken from appnote.iz (Info-ZIP note, 981119) found at \u003ca\n * href\u003d\"ftp://ftp.uu.net/pub/archiving/zip/doc/\"\u003eftp://ftp.uu.net/pub/archiving/zip/doc/\u003c/a\u003e\u003c/p\u003e\n *\n * \u003cp\u003eShort is two bytes and Long is four bytes in big endian byte and\n * word order, device numbers are currently not supported.\u003c/p\u003e\n * @NotThreadSafe\n *\n * \u003cp\u003eSince the documentation this class is based upon doesn\u0027t mention\n * the character encoding of the file name at all, it is assumed that\n * it uses the current platform\u0027s default encoding.\u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Standard Unix stat(2) file mode.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * User ID.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Group ID.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "link"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * File this entry points to, if it is a symbolic link.\n     *\n     * \u003cp\u003eempty string - if entry is not a symbolic link.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dirFlag"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Is this an entry for a directory?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Instance used to calculate checksums.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.AsiExtraField()",
      "begin_line": 85,
      "end_line": 86,
      "comment": " Constructor for AsiExtraField. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getHeaderId()",
      "begin_line": 92,
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
      "end_line": 111,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 109,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getCentralDirectoryLength()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Delegate to local file data.\n     * @return the centralDirectory length\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getLocalFileDataData()",
      "begin_line": 127,
      "end_line": 154,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 81)",
        "(line 131,col 9)-(line 131,col 70)",
        "(line 133,col 9)-(line 133,col 60)",
        "(line 135,col 9)-(line 136,col 43)",
        "(line 138,col 9)-(line 139,col 40)",
        "(line 140,col 9)-(line 141,col 40)",
        "(line 143,col 9)-(line 143,col 67)",
        "(line 146,col 9)-(line 146,col 20)",
        "(line 147,col 9)-(line 147,col 25)",
        "(line 148,col 9)-(line 148,col 45)",
        "(line 150,col 9)-(line 150,col 59)",
        "(line 151,col 9)-(line 151,col 73)",
        "(line 152,col 9)-(line 152,col 61)",
        "(line 153,col 9)-(line 153,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getCentralDirectoryData()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Delegate to local file data.\n     * @return the local file data\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setUserId(int)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Set the user id.\n     * @param uid the user id\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getUserId()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Get the user id.\n     * @return the user id\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setGroupId(int)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Set the group id.\n     * @param gid the group id\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getGroupId()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Get the group id.\n     * @return the group id\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setLinkedFile(java.lang.String)",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * Indicate that this entry is a symbolic link to the given filename.\n     *\n     * @param name Name of the file this entry links to, empty String\n     *             if it is not a symbolic link.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 20)",
        "(line 205,col 9)-(line 205,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getLinkedFile()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Name of linked file\n     *\n     * @return name of the file this entry links to if it is a\n     *         symbolic link, the empty string otherwise.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.isLink()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Is this entry a symbolic link?\n     * @return true if this is a symbolic link\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setMode(int)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * File mode of this file.\n     * @param mode the file mode\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getMode()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * File mode of this file.\n     * @return the file mode\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.setDirectory(boolean)",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n     * Indicate whether this entry is a directory.\n     * @param dirFlag if true, this entry is a directory\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 31)",
        "(line 248,col 9)-(line 248,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.isDirectory()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Is this entry a directory?\n     * @return true if this entry is a directory\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 266,
      "end_line": 298,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     * @param data an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 66)",
        "(line 271,col 9)-(line 271,col 51)",
        "(line 272,col 9)-(line 272,col 69)",
        "(line 273,col 9)-(line 273,col 20)",
        "(line 274,col 9)-(line 274,col 24)",
        "(line 275,col 9)-(line 275,col 49)",
        "(line 276,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 283,col 54)",
        "(line 285,col 9)-(line 285,col 74)",
        "(line 286,col 9)-(line 286,col 40)",
        "(line 287,col 9)-(line 287,col 40)",
        "(line 289,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 296,col 48)",
        "(line 297,col 9)-(line 297,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 304,
      "end_line": 309,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same data in central directory and local file data.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.getMode(int)",
      "begin_line": 316,
      "end_line": 324,
      "comment": "\n     * Get the file mode for given permissions with the correct file type.\n     * @param mode the mode\n     * @return the type with the mode\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 29)",
        "(line 318,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.AsiExtraField.clone()",
      "begin_line": 326,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 335,col 9)"
      ]
    }
  ]
}