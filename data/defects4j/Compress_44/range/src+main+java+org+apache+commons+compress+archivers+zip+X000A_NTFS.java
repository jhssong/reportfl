{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X000A_NTFS",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 66,
      "end_line": 394,
      "comment": "\n * NTFS extra field that was thought to store various attributes but\n * in reality only stores timestamps.\n *\n * \u003cpre\u003e\n *    4.5.5 -NTFS Extra Field (0x000a):\n *\n *       The following is the layout of the NTFS attributes\n *       \"extra\" block. (Note: At this time the Mtime, Atime\n *       and Ctime values MAY be used on any WIN32 system.)\n *\n *       Note: all fields stored in Intel low-byte/high-byte order.\n *\n *         Value      Size       Description\n *         -----      ----       -----------\n * (NTFS)  0x000a     2 bytes    Tag for this \"extra\" block type\n *         TSize      2 bytes    Size of the total \"extra\" block\n *         Reserved   4 bytes    Reserved for future use\n *         Tag1       2 bytes    NTFS attribute tag value #1\n *         Size1      2 bytes    Size of attribute #1, in bytes\n *         (var)      Size1      Attribute #1 data\n *          .\n *          .\n *          .\n *          TagN       2 bytes    NTFS attribute tag value #N\n *          SizeN      2 bytes    Size of attribute #N, in bytes\n *          (var)      SizeN      Attribute #N data\n *\n *        For NTFS, values for Tag1 through TagN are as follows:\n *        (currently only one set of attributes is defined for NTFS)\n *\n *          Tag        Size       Description\n *          -----      ----       -----------\n *          0x0001     2 bytes    Tag for attribute #1\n *          Size1      2 bytes    Size of attribute #1, in bytes\n *          Mtime      8 bytes    File last modification time\n *          Atime      8 bytes    File last access time\n *          Ctime      8 bytes    File creation time\n * \u003c/pre\u003e\n *\n * @since 1.11\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TIME_ATTR_TAG"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TIME_ATTR_SIZE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifyTime"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accessTime"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createTime"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getHeaderId()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * The Header-ID.\n     *\n     * @return the value for the header id for this extrafield\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getLocalFileDataLength()",
      "begin_line": 91,
      "end_line": 97,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 96,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getCentralDirectoryLength()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * \u003cp\u003eFor X5455 the central length is often smaller than the\n     * local length, because central cannot contain access or create\n     * timestamps.\u003c/p\u003e\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getLocalFileDataData()",
      "begin_line": 120,
      "end_line": 134,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 74)",
        "(line 123,col 9)-(line 123,col 20)",
        "(line 124,col 9)-(line 124,col 68)",
        "(line 125,col 9)-(line 125,col 17)",
        "(line 126,col 9)-(line 126,col 69)",
        "(line 127,col 9)-(line 127,col 17)",
        "(line 128,col 9)-(line 128,col 65)",
        "(line 129,col 9)-(line 129,col 17)",
        "(line 130,col 9)-(line 130,col 65)",
        "(line 131,col 9)-(line 131,col 17)",
        "(line 132,col 9)-(line 132,col 65)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getCentralDirectoryData()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * The actual data to put into central directory data - without Header-ID\n     * or length specifier.\n     *\n     * @return the central directory data\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 155,
      "end_line": 174,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param data   an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws java.util.zip.ZipException on error\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 40)",
        "(line 162,col 9)-(line 162,col 20)",
        "(line 164,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 180,
      "end_line": 186,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same parsing logic for both central directory and local file data.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 16)",
        "(line 185,col 9)-(line 185,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getModifyTime()",
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * Returns the \"File last modification time\" of this zip entry as\n     * a ZipEightByteInteger object, or {@link\n     * ZipEightByteInteger#ZERO} if no such timestamp exists in the\n     * zip entry.\n     *\n     * @return File last modification time\n     ",
      "child_ranges": [
        "(line 196,col 50)-(line 196,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getAccessTime()",
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n     * Returns the \"File last access time\" of this zip entry as a\n     * ZipEightByteInteger object, or {@link ZipEightByteInteger#ZERO}\n     * if no such timestamp exists in the zip entry.\n     *\n     * @return File last access time\n     ",
      "child_ranges": [
        "(line 205,col 50)-(line 205,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getCreateTime()",
      "begin_line": 214,
      "end_line": 214,
      "comment": "\n     * Returns the \"File creation time\" of this zip entry as a\n     * ZipEightByteInteger object, or {@link ZipEightByteInteger#ZERO}\n     * if no such timestamp exists in the zip entry.\n     *\n     * @return File creation time\n     ",
      "child_ranges": [
        "(line 214,col 50)-(line 214,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getModifyJavaTime()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Returns the modify time as a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     *\n     * @return modify time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getAccessJavaTime()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Returns the access time as a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     *\n     * @return access time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.getCreateJavaTime()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Returns the create time as a a java.util.Date of this zip\n     * entry, or null if no such timestamp exists in the zip entry.\n     *\n     * @return create time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setModifyTime(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Sets the File last modification time of this zip entry using a\n     * ZipEightByteInteger object.\n     *\n     * @param t ZipEightByteInteger of the modify time\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setAccessTime(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Sets the File last access time of this zip entry using a\n     * ZipEightByteInteger object.\n     *\n     * @param t ZipEightByteInteger of the access time\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setCreateTime(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Sets the File creation time of this zip entry using a\n     * ZipEightByteInteger object.\n     *\n     * @param t ZipEightByteInteger of the create time\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setModifyJavaTime(java.util.Date)",
      "begin_line": 281,
      "end_line": 281,
      "comment": "\n     * Sets the modify time as a java.util.Date of this zip entry.\n     *\n     * @param d modify time as java.util.Date\n     ",
      "child_ranges": [
        "(line 281,col 51)-(line 281,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setAccessJavaTime(java.util.Date)",
      "begin_line": 289,
      "end_line": 289,
      "comment": "\n     * Sets the access time as a java.util.Date\n     * of this zip entry.\n     *\n     * @param d access time as java.util.Date\n     ",
      "child_ranges": [
        "(line 289,col 51)-(line 289,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.setCreateJavaTime(java.util.Date)",
      "begin_line": 304,
      "end_line": 304,
      "comment": "\n     * \u003cp\u003e\n     * Sets the create time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d create time as java.util.Date\n     ",
      "child_ranges": [
        "(line 304,col 51)-(line 304,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.toString()",
      "begin_line": 313,
      "end_line": 321,
      "comment": "\n     * Returns a String representation of this class useful for\n     * debugging purposes.\n     *\n     * @return A String representation of this class useful for\n     *         debugging purposes.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 319,col 74)",
        "(line 320,col 9)-(line 320,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.equals(java.lang.Object)",
      "begin_line": 323,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.hashCode()",
      "begin_line": 335,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 22)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.reset()",
      "begin_line": 356,
      "end_line": 360,
      "comment": "\n     * Reset state back to newly constructed state.  Helps us make sure\n     * parse() calls always generate clean results.\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 51)",
        "(line 358,col 9)-(line 358,col 51)",
        "(line 359,col 9)-(line 359,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.readTimeAttr(byte[], int, int)",
      "begin_line": 362,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPOCH_OFFSET"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " this is the offset of Windows time 0 to Unix epoch in 100-nanosecond intervals"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.dateToZip(java.util.Date)",
      "begin_line": 383,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 39)",
        "(line 385,col 9)-(line 385,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X000A_NTFS.zipToDate(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 388,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 77)",
        "(line 390,col 9)-(line 390,col 66)",
        "(line 391,col 9)-(line 391,col 27)"
      ]
    }
  ]
}