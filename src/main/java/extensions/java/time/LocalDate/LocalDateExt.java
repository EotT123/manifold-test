package extensions.java.time.LocalDate;

import java.time.LocalDate;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.Intercept;
import manifold.ext.rt.api.This;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
@Extension
public class LocalDateExt {

  @Intercept
  public static @Nullable LocalDate plusDays(@This @Nullable LocalDate date, long days) {
    return date != null ? date.plusDays(days) : null;
  }
}
