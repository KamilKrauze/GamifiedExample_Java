package Game.Data.Internal;

public enum SessionEndReason
{
    /// Game session ended peacefully (player pressed quit.)
    SessionEnded,
    /// Something caused the session to end forcefully.
    ForceClosed,
    /// Unhandled code caused the session to end unexpectedly.
    ExceptionThrown,
}
